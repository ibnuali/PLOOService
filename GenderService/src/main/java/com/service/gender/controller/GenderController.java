package com.service.gender.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.gender.model.GenderModel;
import com.service.gender.repository.GenderRepository;

@RestController
@RequestMapping(value="/gender")
public class GenderController {
	@Autowired
	GenderRepository genderRepo;
	
	@RequestMapping(value="/getall/", method = RequestMethod.GET)
	public List<GenderModel> findAll(){
		return genderRepo.findAll();
	}
}
