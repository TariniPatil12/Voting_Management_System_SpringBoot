package com.example.Voting_System.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private @NotBlank(message = "Name cannot be empty") @Size(min = 4, max = 12, message = "Name should have at least 4 to 12 characters") @Pattern(regexp = "^[a-zA-Z]+$", message = "Only characters are allowed") String aname;
	private String address;
	private String gender;
	private Date dob;
	private String username;
	private String password;

	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", address=" + address + ", gender=" + gender + ", dob=" + dob
				+ ", username=" + username + ", password=" + password + "]";
	}

	public Admin(int aid,
			@NotBlank(message = "Name cannot be empty") @Size(min = 4, max = 12, message = "Name should have at least 4 to 12 characters") @Pattern(regexp = "^[a-zA-Z]+$", message = "Only characters are allowed") String aname,
			String address, String gender, Date dob, String username, String password) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
