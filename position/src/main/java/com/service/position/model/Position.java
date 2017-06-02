package com.service.position.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
public class Position {
	@Id
	@Column(name = "short_position")
	private String short_position;
	
	@Column(name = "long_position")
	private String long_position;
	
	/* Get Set Short Position */
	public String getShort_position(){
		return short_position;
	}
	
	public void setShort_position(String short_position){
		this.short_position = short_position;
	}
	/*	----------------------------- */
	
	/* Get Set Long Position */
	public String getLong_position(){
		return long_position;
	}
	
	public void setLong_position(String long_position){
		this.long_position = long_position;
	}
	
	/*	----------------------------- */

}
