package com.example.springh2boot11919.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String joke;
	
	public Joke() {
		super();
	}
	
	public Joke(String joke) {
		super();
		this.joke = joke;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}

	@Override
	public String toString() {
		return "Joke [id=" + id + ", joke=" + joke + "]";
	}

}
