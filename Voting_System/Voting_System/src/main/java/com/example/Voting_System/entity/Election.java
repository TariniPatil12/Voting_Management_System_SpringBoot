package com.example.Voting_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Election {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String date;
	private String state;
	private String city;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Election(int id, String name, String description, String date, String state, String city) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.state = state;
		this.city = city;
	}

	public Election() {
	}

	public String toString() {
		return "Election [id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", date="
				+ this.date + ", state=" + this.state + ", city=" + this.city + "]";
	}
}