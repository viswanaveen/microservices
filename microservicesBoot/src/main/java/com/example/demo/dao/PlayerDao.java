package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.domain.Players;
import com.example.demo.domain.Team;

@RestResource(path="players", rel="players")
public interface PlayerDao extends CrudRepository<Players, Long>{

}
