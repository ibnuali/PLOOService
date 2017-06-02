package com.service.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.location.model.Country;

public interface CountryRepository extends CrudRepository<Country, Long>{
	@Query("SELECT c FROM Country c WHERE c.id_country = ?1")
	Country findById(int id_country);
	
	@Query("SELECT c FROM Country c")
	List<Country> findAll();
}
