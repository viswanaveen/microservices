package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team {

	@Id @GeneratedValue
	Long id;
	private String name;
	private String location;
	private String mascotte;
	@OneToMany(cascade=CascadeType.ALL) 
	@JoinColumn(name="teamId")
	private Set<Players> players;
	
	public Team() {
  super();
	}
	
	
	public Team(String name, String location, Set<Players> players) {
		this();
		this.name = name;
		this.location = location;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public Set<Players> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}


}
