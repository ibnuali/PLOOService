package com.service.level.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "level_category")
public class LevelCategory {
	 @Id 
	 @Column(name = "name_category") 
	 private String name_category; 
	 
	 /* Get Set Level Category*/
	 public String getLevelCategory() { 
		    return name_category; 
	 } 
	 public void setLevelCategory(String name_category) { 
		    this.name_category = name_category; 
	 }
	 /* ------------------------------ */
	 
}
