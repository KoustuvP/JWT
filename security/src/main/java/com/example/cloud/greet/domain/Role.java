package com.example.cloud.greet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column()
	private String userName;
	
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}

}
