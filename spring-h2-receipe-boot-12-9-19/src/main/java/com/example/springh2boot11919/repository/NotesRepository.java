package com.example.springh2boot11919.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2boot11919.model.Notes;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Long>{

}
