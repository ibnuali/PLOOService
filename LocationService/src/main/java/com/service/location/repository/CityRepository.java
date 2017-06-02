package com.service.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.location.model.City;
import com.service.location.model.Province;

public interface CityRepository extends CrudRepository<City, Long>{
	@Query("SELECT c FROM City c WHERE c.id_province = ?1")
	List<City> findByProvince(Province prov);
	
	@Query("SELECT c FROM City c")
	List<City> findAll();
}
