package com.service.level.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.level.model.LevelCategory;

public interface LevelCategoryRepository extends CrudRepository<LevelCategory, Long>{
	@Query("SELECT c FROM LevelCategory c")
	List<LevelCategory> findAll();
}
