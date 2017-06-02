package com.service.level.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.level.model.LevelCategory;
import com.service.level.repository.LevelCategoryRepository;

@RestController
public class LevelCategoryController {
	@Autowired
	LevelCategoryRepository levelCatRepo;
	
	@RequestMapping(value="/findallcategory/", method = RequestMethod.GET)
	public List<LevelCategory> findAll(){
		return levelCatRepo.findAll();
	}
}
