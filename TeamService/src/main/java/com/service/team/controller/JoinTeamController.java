package com.service.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.team.model.JoinTeam;

import com.service.team.repository.JoinTeamRepository;

@RestController
@RequestMapping(value="/jointeam")
public class JoinTeamController {
	@Autowired
	JoinTeamRepository jointeam_repo;
	
	@RequestMapping(value="/getbyteam/{id_team}")
    public List<JoinTeam> findbyTeam(@PathVariable int id_team){
		return jointeam_repo.findByTeam(id_team);
    }
	
	@RequestMapping(value="/getbyplayer/{id_player}")
    public List<JoinTeam> findbyPlayer(@PathVariable int id_player){
		return jointeam_repo.findByPlayer(id_player);
    }
}
