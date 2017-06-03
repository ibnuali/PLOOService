/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package com.service.rating.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.rating.model.RatingCategory;

public interface RatingCategoryRepository extends CrudRepository<RatingCategory, String>{
	@Query("SELECT rc From RatingCategory rc WHERE rc.short_rating_category = ?1")
	public RatingCategory findRatingPlayer(String short_rating_category);
}
