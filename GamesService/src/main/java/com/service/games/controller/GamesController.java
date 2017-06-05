package com.service.games.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.games.model.Games;
import com.service.games.repository.GamesRepository;


@RestController
@RequestMapping(value="/games")
public class GamesController {
	@Autowired
	GamesRepository games_repo;
	
	@RequestMapping(value="/getbyid/{id_games}",method = RequestMethod.GET)
    public @ResponseBody Games findbyId(@PathVariable int id_games){
		return games_repo.findById(id_games);
    }
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
    public @ResponseBody Games insertGames(@RequestBody final Games inputGames){
		Date localDate = new Date();
		java.sql.Timestamp sqlDateNow = new java.sql.Timestamp(localDate.getTime());
		
		inputGames.setGames_created_at(sqlDateNow);
		inputGames.setGames_type("game");
		
		Games outputGames = new Games();
		outputGames = games_repo.save(inputGames);
		return outputGames;
    }
}
