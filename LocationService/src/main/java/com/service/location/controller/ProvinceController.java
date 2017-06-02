package com.service.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.location.model.Country;
import com.service.location.model.Province;
import com.service.location.repository.CountryRepository;
import com.service.location.repository.ProvinceRepository;

@RestController
public class ProvinceController {
	@Autowired
	ProvinceRepository prov_repo;
	
	@Autowired
	CountryRepository coun_repo;
	
	@RequestMapping(value = "/getProvinceByCountry/{id_country}", method = RequestMethod.GET)
	public List<Province> findByCountry(@PathVariable int id_country){
		Country country = new Country();
		country = coun_repo.findById(id_country);
		return prov_repo.findByCountry(country);
	}
	
	@RequestMapping(value = "/getAllProvince")
	public List<Province> findAll(){
		return prov_repo.findAll();
	}
	
	@RequestMapping(value = "/getProvince/{id_province}", method = RequestMethod.GET)
	public Province findById(@PathVariable int id_province){
		return prov_repo.findById(id_province);
	}
}