package com.example.springh2boot11919.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springh2boot11919.model.Joke;
import com.example.springh2boot11919.repository.JokeRepository;

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
		return "redirect:/joke/home";
	}
	
	@PostMapping("/jokes")
	public String randomJoke(@ModelAttribute ("addJoke") Joke theJoke , Model theModel) {
		jokeRepository.save(theJoke);
		return "redirect:/joke/home";
	}
	
	@PostMapping("/joke-of-the-day")
	public String jokeOfTheDay(Model theModel) {
		List <Joke> listJoke = new ArrayList<>();
		jokeRepository.findAll().forEach(joke -> listJoke.add(joke));
		Collections.shuffle(listJoke);
		theModel.addAttribute("theJoke", listJoke.get(0));
		return "jokeoftheday";
	}

}
