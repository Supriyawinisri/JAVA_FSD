package com.example.springh2boot11919.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2boot11919.model.Ingredients;
import com.example.springh2boot11919.model.Notes;
import com.example.springh2boot11919.model.Receipe;
import com.example.springh2boot11919.repository.IngredientsRepository;
import com.example.springh2boot11919.repository.NotesRepository;
import com.example.springh2boot11919.repository.ReceipeRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private IngredientsRepository ingredientsRepository;
	private ReceipeRepository receipeRepository;
	private NotesRepository notesRepository;
	
	public DevJpaBootStrap(IngredientsRepository ingredientsRepository, ReceipeRepository receipeRepository,
			NotesRepository notesRepository) {
		super();
		this.ingredientsRepository = ingredientsRepository;
		this.receipeRepository = receipeRepository;
		this.notesRepository = notesRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();		
	}

	private void init() {
		// TODO Auto-generated method stub
		Ingredients ingredients = new Ingredients(20,"ewrr",1l);
		Receipe receipe = new Receipe("20mins","abcd","north","HARD","4mem","Water","youtube","5mins",2l);
		Notes notes = new Notes("notes_1");
		
		
		
		ingredientsRepository.save(ingredients);
		receipeRepository.save(receipe);
		notesRepository.save(notes);
		
		
	}

}
