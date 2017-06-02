package com.service.level.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.level.model.Level;
import com.service.level.repository.LevelRepository;

@RestController
public class LevelController {
	@Autowired
	LevelRepository levelRepo;
	
	@RequestMapping(value="/findalllevel/", method = RequestMethod.GET)
	public List<Level> findAll(){
		return levelRepo.findAll();
	}
}
