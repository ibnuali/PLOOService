package com.service.level.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.level.model.Level;

public interface LevelRepository extends CrudRepository<Level, Long>{
	@Query("SELECT c FROM Level c")
	List<Level> findAll();
}
