package com.service.team.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "join_team")
public class JoinTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_join_team")
	private int id_join_team;
	
	@Column(name = "id_player")
	private int id_player;
	
	@Column(name = "date_join_team")
	private Timestamp date_join_team;
	
	@Column(name = "status_join_team")
	private int status_join_team;
	
	@Column(name = "official_status_team")
	private int official_status_team;
	
	@Column(name = "date_official_team")
	private Timestamp date_official_team;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_team")
	private Team id_team;

	public int getId_join_team() {
		return id_join_team;
	}

	public void setId_join_team(int id_join_team) {
		this.id_join_team = id_join_team;
	}

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public Timestamp getDate_join_team() {
		return date_join_team;
	}

	public void setDate_join_team(Timestamp date_join_team) {
		this.date_join_team = date_join_team;
	}

	public int getStatus_join_team() {
		return status_join_team;
	}

	public void setStatus_join_team(int status_join_team) {
		this.status_join_team = status_join_team;
	}

	public int getOfficial_status_team() {
		return official_status_team;
	}

	public void setOfficial_status_team(int official_status_team) {
		this.official_status_team = official_status_team;
	}

	public Timestamp getDate_official_team() {
		return date_official_team;
	}

	public void setDate_official_team(Timestamp date_official_team) {
		this.date_official_team = date_official_team;
	}

	public Team getId_team() {
		return id_team;
	}

	public void setId_team(Team id_team) {
		this.id_team = id_team;
	}
	
	public JoinTeam(){
		
	}
}
