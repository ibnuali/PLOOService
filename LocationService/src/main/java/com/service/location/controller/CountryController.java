package com.service.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.location.model.Country;
import com.service.location.repository.CountryRepository;

@RestController
@RequestMapping(value="/country")
public class CountryController {
	@Autowired
	CountryRepository repository;
	
	@RequestMapping(value = "/getall")
	public List<Country> findAll(){
		return repository.findAll();
	}
	
	@RequestMapping(value = "/getcountry/{id_country}", method = RequestMethod.GET)
	public Country findById(@PathVariable int id_country){	
		return repository.findById(id_country);
	}
}
