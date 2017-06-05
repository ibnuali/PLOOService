package com.service.level.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.level.model.LevelHistory;
import com.service.level.repository.LevelHistoryRepository;
import com.service.level.repository.LevelRepository;

@RestController
@RequestMapping(value="/levelhistory")
public class LevelHistoryController {
	@Autowired
	LevelHistoryRepository levelHistoryRepo;
	
	@Autowired
	LevelRepository levelRepository;
	
	@RequestMapping(value="/getbyplayer/{id_player}", method = RequestMethod.GET)
	public List<LevelHistory> findLevelByPlayer(@PathVariable int id_player){	
		return levelHistoryRepo.findLevelByPlayer(id_player);
	}
}
