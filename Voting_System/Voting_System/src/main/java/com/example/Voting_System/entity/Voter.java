package com.example.Voting_System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private @NotBlank(message = "Name cannot be Blank") @Pattern(regexp = "^[a-zA-Z]+$", message = "Only characters are allowed") @Size(min = 8, max = 16, message = "Name should have at least 8 to 16 characters") String name;
	private LocalDate dob;
	private String gender;
	private String username;
	private String password;
	@Column(nullable = false)
	private boolean verified = false;

	public Voter() {
	}

	public Voter(int id, String name, LocalDate dob, String gender, String username, String password,
			boolean verified) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.verified = verified;
	}

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

	public LocalDate getDob() {
		return this.dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerified() {
		return this.verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String toString() {
		int var10000 = this.id;
		return "Voter [id=" + var10000 + ", name=" + this.name + ", dob=" + String.valueOf(this.dob) + ", gender="
				+ this.gender + ", username=" + this.username + ", password=" + this.password + ", verified="
				+ this.verified + "]";
	}
}