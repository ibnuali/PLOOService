package com.service.position.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.position.model.PositionPlayer;

public interface PositionPlayerRepository extends CrudRepository<PositionPlayer, Long>{
	@Query("SELECT pp FROM PositionPlayer pp WHERE pp.id_player = ?1")
	List<PositionPlayer> findById(int id_player);
}
