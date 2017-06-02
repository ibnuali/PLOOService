package com.service.achievement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.achievement.model.AchievementPlayer;
import com.service.achievement.repository.AchievementPlayerRepository;

@RestController
public class AchievementPlayerController {
	@Autowired
	AchievementPlayerRepository achievPlayer_Repo;
	
	@RequestMapping(value="/findbyplayer/{id_player}", method = RequestMethod.GET)
	public List<AchievementPlayer> findAchivmentByPlayer(@PathVariable int id_player){
		return achievPlayer_Repo.findAchivmentByPlayer(id_player);
	}
}
