package com.service.level.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity 
@Table(name = "level")
public class Level {
	 @Id 
	 @Column(name = "score_level") 
	 private int score_level; 
	 
	 @Column(name = "score_exp") 
	 private int score_exp; 
	 
	 @Autowired 
	 @ManyToOne(fetch=FetchType.EAGER) 
	 @JoinColumn(name = "name_category") 
	 private LevelCategory name_category; 
	 
	 /* Get Set Score Level*/
	 public int getScoreLevel() { 
		    return score_level; 
	 } 
	 public void setScoreLevel(int score_level) { 
		    this.score_level = score_level; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Name Player Achievement*/
	 public int getScoreExp() { 
		    return score_exp; 
	 } 
	 public void setScorExp(int score_exp) { 
		    this.score_exp = score_exp; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Short Position */
		public LevelCategory getNameCategory(){
			return name_category;
		}
		
		public void setNameCategory(LevelCategory name_category){
			this.name_category = name_category;
		}
		
	/*	----------------------------- */
}
