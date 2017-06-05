package com.service.position.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.position.model.PositionPlayer;
import com.service.position.repository.PositionPlayerRepository;
import com.service.position.repository.PositionRepository;

@RestController
public class PlayerPosition {
	@Autowired
	PositionRepository positionrepo;
	
	@Autowired
	PositionPlayerRepository positionplayerrepo;
	
	@RequestMapping(value="/findpositionbyplayer/{id_player}", method = RequestMethod.GET)
	public List<PositionPlayer> findPositonByPlayer(@PathVariable int id_player){	
		return positionplayerrepo.findById(id_player);
	}
}
