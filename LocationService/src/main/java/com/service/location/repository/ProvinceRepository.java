package com.service.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.location.model.Country;
import com.service.location.model.Province;

public interface ProvinceRepository extends CrudRepository<Province, Long>{
	@Query("SELECT p FROM Province p WHERE p.id_country = ?1")
	List<Province> findByCountry(Country id_country); 
	
	@Query("SELECT p FROM Province p")
	List<Province> findAll();
	
	@Query("SELECT p FROM Province p WHERE p.id_province =?1")
	Province findById(int id);
}
