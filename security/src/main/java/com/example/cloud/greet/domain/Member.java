package com.example.cloud.greet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Member {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@NotEmpty(message="user name should not be empty")
	@Pattern(regexp="[^0-9]*", message="Numbers are not accepted")
	@Column()
	private String userName;
	
	@Column()
	private String password;
	
	@Column()
	private int enabled=1;
	
	@Email
	@Column()
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
