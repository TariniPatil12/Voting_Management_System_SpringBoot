package com.example.Voting_System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Arrays;

@Entity
public class Profile {
	@Id
	@Column(name = "profile", length = 1000000000)
	private int pid;
	private byte[] image;
	

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Profile(int pid, byte[] image) {
		this.pid = pid;
		this.image = image;
	}

	public Profile() {
	}

	public String toString() {
		int var10000000 = this.pid;
		return "Profile [pid=" + var10000000 + ", image=" + Arrays.toString(this.image) + "]";
	}
}
