package com.service.rating.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating {
	@Id
	@Column(name = "score_rating")
	private double score_rating;

	public double getScore_rating() {
		return score_rating;
	}

	public void setScore_rating(double score_rating) {
		this.score_rating = score_rating;
	}
	
	public Rating(){
		
	}
}
