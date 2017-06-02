package com.service.rating.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.rating.model.Rating;

public interface RatingRepository extends CrudRepository<Rating, Long>{
	@Query("SELECT r FROM Rating r WHERE r.score_rating = ?1")
	public Rating findById(double score_rating);
}
