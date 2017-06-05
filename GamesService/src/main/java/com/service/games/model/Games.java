package com.service.games.model;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Games {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_games")
	private int id_games;
	
	@Column(name = "id_city")
	private int id_city;
	
	@Column(name = "games_name")
	private String games_name;
	
	@Column(name = "games_date")
	private Timestamp games_date;
	
	@Column(name = "games_duration", nullable = true)
	private Time games_duration;
	
	@Column(name = "games_address")
	private String games_address;
	
	@Column(name = "games_pool")
	private String games_pool;
	
	@Column(name = "games_password", nullable = true)
	private String games_password;
	
	@Column(name = "games_type")
	private String games_type;
	
	@Column(name = "games_created_at")
	private Timestamp games_created_at;

	public int getId_games() {
		return id_games;
	}

	public void setId_games(int id_games) {
		this.id_games = id_games;
	}

	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getGames_name() {
		return games_name;
	}

	public void setGames_name(String games_name) {
		this.games_name = games_name;
	}

	public Timestamp getGames_date() {
		return games_date;
	}

	public void setGames_date(Timestamp games_date) {
		this.games_date = games_date;
	}

	public Time getGames_duration() {
		return games_duration;
	}

	public void setGames_duration(Time games_duration) {
		this.games_duration = games_duration;
	}

	public String getGames_address() {
		return games_address;
	}

	public void setGames_address(String games_address) {
		this.games_address = games_address;
	}

	public String getGames_pool() {
		return games_pool;
	}

	public void setGames_pool(String games_pool) {
		this.games_pool = games_pool;
	}

	public String getGames_password() {
		return games_password;
	}

	public void setGames_password(String games_password) {
		this.games_password = games_password;
	}

	public String getGames_type() {
		return games_type;
	}

	public void setGames_type(String games_type) {
		this.games_type = games_type;
	}

	public Timestamp getGames_created_at() {
		return games_created_at;
	}

	public void setGames_created_at(Timestamp games_created_at) {
		this.games_created_at = games_created_at;
	}
	
	public Games(){
		
	}
}
