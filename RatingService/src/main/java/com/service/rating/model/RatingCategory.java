/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package com.service.rating.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating_category")
public class RatingCategory {
	@Id
	@Column(name = "short_rating_category")
	private String short_rating_category;
	
	@Column(name = "long_rating_category")
	private String long_rating_category;

	public String getShort_rating_category() {
		return short_rating_category;
	}

	public void setShort_rating_category(String short_rating_category) {
		this.short_rating_category = short_rating_category;
	}

	public String getLong_rating_category() {
		return long_rating_category;
	}

	public void setLong_rating_category(String long_rating_category) {
		this.long_rating_category = long_rating_category;
	}
	
	public RatingCategory(){
		
	}
	
}
