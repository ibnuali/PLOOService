package com.service.level.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity 
@Table(name = "level_history")
public class LevelHistory {

		 @Id 
		 @Column(name = "id_level_history") 
		 private int id_level_history; 
		 
		 @Column(name = "id_player") 
		 private int id_player; 
		 
		 @Column(name = "date_level_history")
		 private Date date_level_history;
		 
		 @Column(name = "player_exp") 
		 private int player_exp; 
		 
		 @Autowired 
		 @ManyToOne(fetch=FetchType.EAGER) 
		 @JoinColumn(name = "score_level") 
		 private Level score_level; 
		 
		 /* Get Set Id Level History*/
		 public int getId_LevelHistory() { 
			    return id_level_history; 
		 } 
		 public void setId_LevelHistory(int id_level_history) { 
			    this.id_level_history = id_level_history; 
		 }
		 /* ------------------------------ */
		 
		 /* Get Set id Player*/
		 public int getIdPlayer() { 
			    return id_player; 
		 } 
		 public void setIdPlayer(int id_player) { 
			    this.id_player = id_player; 
		 }
		 /* ------------------------------ */
		 
		 /* Get Set date_level_history*/
		 public Date getDateLevel_history() { 
			    return date_level_history; 
		 } 
		 public void setDateLevel_history(Date date_level_history) { 
			    this.date_level_history = date_level_history; 
		 }
		 /* ------------------------------ */
		 
		 /* Get Set date_level_history*/
		 public int getPlayer_exp() { 
			    return player_exp; 
		 } 
		 public void setPlayer_exp(int player_exp) { 
			    this.player_exp = player_exp; 
		 }
		 /* ------------------------------ */
		 
		 /* Get Set date_level_history*/
		 public Level getScoreLevel() { 
			    return score_level; 
		 } 
		 public void setScoreLevel(Level score_level) { 
			    this.score_level = score_level; 
		 }
		 /* ------------------------------ */
}
