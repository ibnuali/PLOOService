package com.service.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.rating.model.RatingHistory;;

public interface RatingHistoryRepository extends CrudRepository<RatingHistory, Long>{
	
	@Query("SELECT rh From RatingHistory rh WHERE rh.id_player = ?1")
	List<RatingHistory>findRatingPlayer(int id_player);
}
