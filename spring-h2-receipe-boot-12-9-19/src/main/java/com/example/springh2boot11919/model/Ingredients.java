package com.example.springh2boot11919.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ingredients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double amount;
	private String description;
	private Long r_id;
	@ManyToOne
	@JoinColumn
	private Receipe receipe;

	public Ingredients() {
		super();
	}

	public Ingredients(double amount, String description, Long r_id) {
		super();
		this.amount = amount;
		this.description = description;
		this.r_id = r_id;
	}

	public Ingredients(double amount, String description, Long r_id, Receipe receipe) {
		super();
		this.amount = amount;
		this.description = description;
		this.r_id = r_id;
		this.receipe = receipe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getR_id() {
		return r_id;
	}

	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}

	public Receipe getReceipe() {
		return receipe;
	}

	public void setReceipe(Receipe receipe) {
		this.receipe = receipe;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredients ingredients = (Ingredients) o;

        return id != null ? id.equals(ingredients.id) : ingredients.id == null;
	}

	@Override
	public String toString() {
		return "Ingredients [id=" + id + ", amount=" + amount + ", description=" + description + ", r_id=" + r_id
				+ ", receipe=" + receipe + "]";
	}

}
