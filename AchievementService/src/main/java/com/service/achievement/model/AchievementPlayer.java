package com.service.achievement.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "player_achievement")
public class AchievementPlayer {
	 @Id 
	 @Column(name = "id_player_achievement") 
	 private int id_player_achievement; 
	 
	 @Column(name = "id_player")
	 private int id_player;
	 
	 @Column(name = "name_player_achievement")
	 private String name_player_achievement;
	 
	 @Column(name ="date_player_achievement")
	 private Date date_player_achievement;
	 
	 @Column(name ="name_event_player_achievement")
	 private String name_event_player_achievement;
	 
	 @Column(name ="with_team_player_achievement")
	 private String with_team_player_achievement;
	 
	 @Column(name="photo_prove_player_achievement")
	 private String photo_prove_player_achievement;
	 
	 /* Get Set Id Player Achievement*/
	 public int getId_Team_Achievement() { 
		    return id_player_achievement; 
	 } 
	 public void setId_Team_Achievement(int id_player_achievement) { 
		    this.id_player_achievement = id_player_achievement; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Id Player*/
	 public int getId_Player() { 
		    return id_player; 
	 } 
	 public void setId_Player(int id_player) { 
		    this.id_player = id_player; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Name Player Achievement*/
	 public String getname_Player_Achievement() { 
		    return name_player_achievement; 
	 } 
	 public void setname_Player_Achievement(String name_player_achievement) { 
		    this.name_player_achievement = name_player_achievement; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Date Player Achievement*/
	 public Date getdate_Player_Achievement() { 
		    return date_player_achievement; 
	 } 
	 public void setdate_Player_Achievement(Date date_player_achievement) { 
		    this.date_player_achievement = date_player_achievement; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Event Player Achievement*/
	 public String getevent_Player_Achievement() { 
		    return name_event_player_achievement; 
	 } 
	 public void setevenet_Player_Achievement(String name_event_player_achievement) { 
		    this.name_event_player_achievement = name_event_player_achievement; 
	 }
	 /* ------------------------------ */
}
