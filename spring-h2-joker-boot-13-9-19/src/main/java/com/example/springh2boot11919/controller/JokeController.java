package com.example.springh2boot11919.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springh2boot11919.model.Joke;
import com.example.springh2boot11919.repository.JokeRepository;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/joke")
public class JokeController {
	
	JokeRepository jokeRepository;
	
	public JokeController(JokeRepository jokeRepository) {
		super();
		this.jokeRepository = jokeRepository;
	}

	@RequestMapping("/home")
	public String home() {
		return "joke";
	}
	
	@PostMapping("/add-joke")
	public String addJoke(Model theModel) {
		Joke joke = new Joke();
		theModel.addAttribute("addJoke", joke);
		return "add_joke";
	}
	
	@PostMapping("/save")
	public String saveJoke(@ModelAttribute ("addJoke") Joke theJoke , Model theModel) {
		jokeRepository.save(theJoke);
		return "redirect:/joke/joke-of-the-day";
	}
	
	@PostMapping("/jokes")
	public String randomJoke(@ModelAttribute ("addJoke") Joke theJoke , Model theModel) {
		jokeRepository.save(theJoke);
		return "redirect:/joke/home";
	}
	
	@PostMapping("/joke-of-the-day")
	public String jokeOfTheDay(Model theModel) {
		List <Joke> joke2 = new ArrayList<>();
		jokeRepository.findAll().forEach(joke1 -> joke2.add(joke1));
		Collections.shuffle(joke2);		
		System.out.println(joke2);
		theModel.addAttribute("theJoke", joke2);
		return "jokeoftheday";
	}

}
