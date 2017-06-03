package com.service.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.team.model.Team;
import com.service.team.repository.TeamRepository;


@RestController
@RequestMapping(value="/team")
public class TeamController {
	@Autowired
	TeamRepository team_repo;
	
	@RequestMapping(value="/getbycode/{team_code}",method = RequestMethod.GET)
    public Team findbyCode(@PathVariable String team_code){
		return team_repo.findByCode(team_code);
    }
	
	@RequestMapping(value="/getbyid/{id_team}",method = RequestMethod.GET)
    public Team findbyCode(@PathVariable int id_team){
		return team_repo.findById(id_team);
    }
}
