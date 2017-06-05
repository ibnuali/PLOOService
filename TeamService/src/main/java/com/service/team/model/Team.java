package com.service.team.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_team")
	private int id_team;
	
	@Column(name = "team_name")
	private String team_name;
	
	@Column(name = "team_code")
	private String team_code;
	
	@Column(name = "team_logo")
	private String team_logo;
	
	@Column(name = "team_established")
	private Date team_established;
	
	@Column(name = "team_created")
	private Timestamp team_created;
	
	@Column(name = "team_update")
	private Timestamp team_update;

	public int getId_team() {
		return id_team;
	}

	public void setId_team(int id_team) {
		this.id_team = id_team;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_code() {
		return team_code;
	}

	public void setTeam_code(String team_code) {
		this.team_code = team_code;
	}

	public String getTeam_logo() {
		return team_logo;
	}

	public void setTeam_logo(String team_logo) {
		this.team_logo = team_logo;
	}

	public Date getTeam_established() {
		return team_established;
	}

	public void setTeam_established(Date team_established) {
		this.team_established = team_established;
	}

	public Date getTeam_created() {
		return team_created;
	}

	public void setTeam_created(Timestamp team_created) {
		this.team_created = team_created;
	}

	public Timestamp getTeam_update() {
		return team_update;
	}

	public void setTeam_update(Timestamp team_update) {
		this.team_update = team_update;
	}
	
	public Team(){
		
	}
}
