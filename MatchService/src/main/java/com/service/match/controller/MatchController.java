package com.service.match.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.match.model.FriendlyMatch;
import com.service.match.repository.MatchRepository;


@RestController
@RequestMapping(value="/match")
public class MatchController {
	@Autowired
	MatchRepository match_repo;
	
	@RequestMapping(value="/getbyid/{id_game}",method = RequestMethod.GET)
    public @ResponseBody FriendlyMatch findbyId(@PathVariable int id_game){
		return match_repo.findById(id_game);
    }
	
	@RequestMapping(value="/getbyplayer/{id_player}")
    public @ResponseBody List<FriendlyMatch> findbyPlayer(@PathVariable int id_player){
		return match_repo.findByPlayer(id_player);
    }
	
}
