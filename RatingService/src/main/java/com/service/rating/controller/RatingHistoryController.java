package com.service.rating.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.service.rating.model.PlayerRating;
import com.service.rating.model.Rating;
import com.service.rating.model.RatingCategory;
import com.service.rating.model.RatingHistory;
import com.service.rating.repository.RatingCategoryRepository;
import com.service.rating.repository.RatingHistoryRepository;
import com.service.rating.repository.RatingRepository;

@RestController
@RequestMapping(value="/ratinghistory")
public class RatingHistoryController {
	@Autowired
	RatingHistoryRepository ratinghistory_repo;
	
	@Autowired
	RatingCategoryRepository ratingcategory_repo;
	
	@Autowired
	RatingRepository rating_repo;
	
	@RequestMapping(value="/getratingplayer/{id}", method = RequestMethod.GET)
	public PlayerRating getRatingPlayer (@PathVariable int id){
		List<RatingHistory> listratinghistory =  ratinghistory_repo.findRatingPlayer(id);
		PlayerRating playerRating = new PlayerRating();
		if(listratinghistory.size() < 1){
			playerRating = new PlayerRating(0,0,0,0,0,0);
		}
		else{
			playerRating.CalculatePlayerRating(ratinghistory_repo.findRatingPlayer(id));
		}
		return playerRating;
	}
	
	@RequestMapping(value="/insertrating",method = RequestMethod.POST)
	public @ResponseBody String insertRatingfromPlayer(@RequestBody final ArrayNode inputRatingHistory){
        
		Date localDate = new Date();
		java.sql.Date sqlDateNow = new java.sql.Date(localDate.getTime());
		
		RatingHistory ratingHistory = new RatingHistory();
		List<RatingHistory> listRatingHistory = new ArrayList<>();
		
		for(JsonNode ratingHistoryNode : inputRatingHistory){
			Rating ratingScore = rating_repo.findById(ratingHistoryNode.get("score_rating").asDouble());
			RatingCategory ratingCategory = ratingcategory_repo.findRatingPlayer(ratingHistoryNode.get("short_rating_category").asText());
			System.out.print(ratingCategory.getShort_rating_category());
	          
			ratingHistory = new RatingHistory(ratingHistoryNode.get("id_player").asInt(),ratingHistoryNode.get("id_games").asInt(), null,ratingHistoryNode.get("player_give_rating").asInt(),sqlDateNow,ratingScore,ratingCategory);
			listRatingHistory.add(ratingHistory);
		}
		
		ratinghistory_repo.save(listRatingHistory);
		
		return "Insert Success";
	}
	
	
}
