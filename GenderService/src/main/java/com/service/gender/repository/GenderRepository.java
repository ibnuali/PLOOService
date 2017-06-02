package com.service.gender.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.gender.model.GenderModel;


public interface GenderRepository extends CrudRepository<GenderModel, Long>{
	@Query("SELECT c FROM GenderModel c")
	List<GenderModel> findAll();
}
