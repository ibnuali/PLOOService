/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package com.service.player.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.player.model.Player;
import com.service.player.repository.PlayerRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
    PlayerRepository player_repo;
	
	@RequestMapping(value="/getbyusernamepassword/{username}/{password}",method = RequestMethod.GET)
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
    public Player find(@PathVariable String username){
		return player_repo.findByUsername(username);
    }
	
	@RequestMapping(value="/insertplayer",method = RequestMethod.POST)
	public @ResponseBody Player insertRatingfromPlayer(@RequestBody final Player inputPlayerData){
        
		Date localDate = new Date();
		java.sql.Timestamp sqlDateNow = new java.sql.Timestamp(localDate.getTime());
		
		inputPlayerData.setCreated_at(sqlDateNow);
		
		Player outputPlayerData = new Player();
		outputPlayerData = player_repo.save(inputPlayerData);
		
		return outputPlayerData;
	}
}
