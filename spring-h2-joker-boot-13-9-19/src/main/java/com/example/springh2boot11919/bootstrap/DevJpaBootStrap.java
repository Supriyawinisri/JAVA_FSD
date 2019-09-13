package com.example.springh2boot11919.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2boot11919.model.Joke;
import com.example.springh2boot11919.repository.JokeRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{

	JokeRepository jokeRepository;
	
	
	public DevJpaBootStrap(JokeRepository jokeRepository) {
		super();
		this.jokeRepository = jokeRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		intit();
	}

	private void intit() {
		// TODO Auto-generated method stub
		Joke joke1 = new Joke("Cute Girlfriend : My Heart Is Like Moble and You Like a Sim Card..!\r\n" + 
				"Boyfriend : I Am Very Happy.!\r\n" + 
				"Girlfriend :don't Be Too Happy..\r\n" + 
				"if I Get a New Offer , I Will Change the Sim Card..!");
		Joke joke2 = new Joke("Diagram in book was not clear..\r\n" + 
				"So, Madam drew diagram on blackboard and announced...\r\n" + 
				"\"Don‘t look at Book Figure, Look at my Figure!\" \r\n" + 
				"It is Bold and Clear - a student said.");
		jokeRepository.save(joke1);
		jokeRepository.save(joke2);
	}

}
