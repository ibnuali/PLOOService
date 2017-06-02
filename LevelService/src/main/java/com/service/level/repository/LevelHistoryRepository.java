package com.service.level.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.level.model.LevelHistory;

public interface LevelHistoryRepository extends CrudRepository<LevelHistory, Long>{
	@Query("SELECT pp FROM LevelHistory pp WHERE pp.id_player = ?1")
	List<LevelHistory> findLevelByPlayer(int id_player);
}
