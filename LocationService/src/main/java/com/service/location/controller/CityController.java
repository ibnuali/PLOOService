package com.service.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.location.model.City;
import com.service.location.model.Province;
import com.service.location.repository.CityRepository;
import com.service.location.repository.ProvinceRepository;

@RestController
public class CityController{
	
	@Autowired
	CityRepository city_repo;
	
	@Autowired
	ProvinceRepository prov_repo;
	
	@RequestMapping(value="/getCityByProvince/{id_province}", method = RequestMethod.GET)
	public List<City> findByProvince(@PathVariable int id_province){
		Province prov = new Province();
		prov = prov_repo.findById(id_province);
		return city_repo.findByProvince(prov);
	}
	
	@RequestMapping(value="/getAllCity")
	public List<City> findAll(){
		return city_repo.findAll();
	}
	
}

