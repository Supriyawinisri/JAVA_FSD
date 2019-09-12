package com.example.springh2boot11919.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String r_notes;
	@OneToMany(mappedBy = "notes", cascade = CascadeType.ALL)
	private Set<Receipe> receipes;

	public Notes() {
		super();
	}

	public Notes(String notes) {
		super();
		this.r_notes = notes;
	}

	public Notes(String notes, Set<Receipe> receipes) {
		super();
		this.r_notes = notes;
		this.receipes = receipes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNotes() {
		return r_notes;
	}

	public void setNotes(String notes) {
		this.r_notes = notes;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Notes notes = (Notes) o;

		return id != null ? id.equals(notes.id) : notes.id == null;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", notes=" + r_notes + "]";
	}

}
