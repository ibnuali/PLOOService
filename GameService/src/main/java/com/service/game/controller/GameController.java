package com.service.game.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.game.model.Game;
import com.service.game.repository.GameRepository;

@RestController
@RequestMapping(value="/game")
public class GameController {
	@Autowired
	GameRepository game_repo;
	
	@RequestMapping(value="/getbyid/{id_game}",method = RequestMethod.GET)
    public @ResponseBody Game findbyId(@PathVariable int id_game){
		return game_repo.findById(id_game);
    }
	
	@RequestMapping(value="/getbyplayer/{id_player}")
    public @ResponseBody List<Game> findbyPlayer(@PathVariable int id_player){
		return game_repo.findByPlayer(id_player);
    }
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
    public @ResponseBody Game insertGames(@RequestBody final Game inputGame){
		Date localDate = new Date();
		java.sql.Timestamp sqlDateNow = new java.sql.Timestamp(localDate.getTime());
		
		inputGame.setGames_created_at(sqlDateNow);
		inputGame.setGames_type("game");
		
		Game outputGames = new Game();
		outputGames = game_repo.save(inputGame);
		return outputGames;
    }
}
