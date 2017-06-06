package api.gateway.futsalkeun.model;

import java.sql.Date;

public class AchievementTeam {

	 private int id_team_achievement; 

	 private int id_team;
	 
	 private String name_team_achievement;
	 
	 private Date date_team_achievement;
	 
	 private String event_team_achievement;
	 
	 /* Get Set Id Team*/
	 public int getId_Team_Achievement() { 
		    return id_team_achievement; 
	 } 
	 public void setId_Team_Achievement(int id_team_achievement) { 
		    this.id_team_achievement = id_team_achievement; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Id Team*/
	 public int getId_Team() { 
		    return id_team; 
	 } 
	 public void setId_Team(int id_team) { 
		    this.id_team = id_team; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Name Team Achievement*/
	 public String getname_Team_Achievement() { 
		    return name_team_achievement; 
	 } 
	 public void setname_Team_Achievement(String name_team_achievement) { 
		    this.name_team_achievement = name_team_achievement; 
	 }
	 /* ------------------------------ */
	 
	 
	 /* Get Set Date Team Achievement*/
	 public Date getdate_Team_Achievement() { 
		    return date_team_achievement; 
	 } 
	 public void setdate_Team_Achievement(Date date_team_achievement) { 
		    this.date_team_achievement = date_team_achievement; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Event Team Achievement*/
	 public String getevent_Team_Achievement() { 
		    return event_team_achievement; 
	 } 
	 public void setevenet_Team_Achievement(String event_team_achievement) { 
		    this.event_team_achievement = event_team_achievement; 
	 }
	 /* ------------------------------ */
		 
}
