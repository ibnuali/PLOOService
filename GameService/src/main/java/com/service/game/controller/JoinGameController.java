package com.service.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.game.repository.JoinGameRepository;

@RestController
@RequestMapping(value="/joingame")
public class JoinGameController {
	@Autowired
	JoinGameRepository joingame_repo;

}
