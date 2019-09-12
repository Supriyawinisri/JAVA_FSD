package com.example.springh2boot11919.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Receipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cook_time;
	private String description;
	private String direction;
	private String difficulty;
	private String servings;
	private String source;
	private String url;
	private String prep_time;
	private Long n_id;
	@ManyToOne
	@JoinColumn
	private Notes notes;
	@OneToMany(mappedBy = "receipe", cascade = CascadeType.ALL)
	private Set<Ingredients> ingredients;

	public Receipe() {
		super();
	}

	public Receipe(String cook_time, String description, String direction, String difficulty, String servings,
			String source, String url, String prep_time, Long n_id) {
		super();
		this.cook_time = cook_time;
		this.description = description;
		this.direction = direction;
		this.difficulty = difficulty;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.prep_time = prep_time;
		this.n_id = n_id;
	}

	public Receipe(String cook_time, String description, String direction, String difficulty, String servings,
			String source, String url, String prep_time, Long n_id, Notes notes) {
		super();
		this.cook_time = cook_time;
		this.description = description;
		this.direction = direction;
		this.difficulty = difficulty;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.prep_time = prep_time;
		this.n_id = n_id;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCook_time() {
		return cook_time;
	}

	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getServings() {
		return servings;
	}

	public void setServings(String servings) {
		this.servings = servings;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPrep_time() {
		return prep_time;
	}

	public void setPrep_time(String prep_time) {
		this.prep_time = prep_time;
	}

	public Long getN_id() {
		return n_id;
	}

	public void setN_id(Long n_id) {
		this.n_id = n_id;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
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

		Receipe receipe = (Receipe) o;

		return id != null ? id.equals(receipe.id) : receipe.id == null;
	}

	@Override
	public String toString() {
		return "Receipe [id=" + id + ", cook_time=" + cook_time + ", description=" + description + ", direction="
				+ direction + ", difficulty=" + difficulty + ", servings=" + servings + ", source=" + source + ", url="
				+ url + ", prep_time=" + prep_time + ", n_id=" + n_id + ", notes=" + notes + "]";
	}

}
