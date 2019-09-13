package com.example.springh2boot11919.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2boot11919.model.Joke;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Long> {

}
