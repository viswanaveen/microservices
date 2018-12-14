package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Players;
import com.example.demo.domain.Team;


@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {
  
	/**
	 * used when run as JAR
	 * @param args
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/**
	 * used when run as WAR
	 * @param args
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}
	
	@PostConstruct
	public void init() {
		Set<Players> players = new HashSet<>();
		players.add(new Players("Naveen","Pitcher"));
		players.add(new Players("Snoopy","shortstop"));
		
		Team team = new Team("India", "Banglore", players);
		teamDao.save(team);
		
	}
	@Autowired
	TeamDao teamDao;
	
}
