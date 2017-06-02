package com.service.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.player.model.Player;
import com.service.player.repository.PlayerRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
    PlayerRepository player_repo;
	
	@RequestMapping(value="/signin/{username}/{password}",method = RequestMethod.GET)
    public Player signIn(@PathVariable String username, @PathVariable String password){
        Player result = new Player();
        result = player_repo.findByUsernamePass(username, password);
        return result;
    }
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Player findById(@PathVariable int id){
		return player_repo.findById(id);
    }
	
	@RequestMapping(value="/getbyusername/{username}",method = RequestMethod.GET)
    public Player fidn(@PathVariable String username){
		return player_repo.findByUsername(username);
    }
}
