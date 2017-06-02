package com.service.achievement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.service.achievement.model.AchievementTeam;
import com.service.achievement.repository.AchievementTeamRepository;

@RestController
public class AchievementTeamController {
	
	@Autowired
	AchievementTeamRepository achievTeam_Repo;
	
	@RequestMapping(value="/findbyteam/{id_team}", method = RequestMethod.GET)
	public List<AchievementTeam> findAchivmentByTeam(@PathVariable int id_team){
		return achievTeam_Repo.findAchivmentByTeam(id_team);
	}
}
