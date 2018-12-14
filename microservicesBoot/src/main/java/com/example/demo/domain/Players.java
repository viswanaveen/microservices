package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Players {
	
	@Id @GeneratedValue
	private Long id;
	private String name;

	private String position;
	
	public Players() {
		super();
		
	}
	public Players(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
