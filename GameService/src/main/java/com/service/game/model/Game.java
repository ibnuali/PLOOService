package com.service.game.model;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {
	@Id
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
	
	@Column(name = "id_player")
	private int id_player;
	
	@Column(name = "required_age_min", nullable = true)
	private int required_age_min;
	
	@Column(name = "required_age_max", nullable = true)
	private int required_age_max;
	
	@Column(name = "required_min_level", nullable = true)
	private int required_min_level;
	
	@Column(name = "required_max_level", nullable = true)
	private int required_max_level;
	
	@Column(name = "required_gender", nullable = true)
	private int required_gender;

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

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public int getRequired_age_min() {
		return required_age_min;
	}

	public void setRequired_age_min(int required_age_min) {
		this.required_age_min = required_age_min;
	}

	public int getRequired_age_max() {
		return required_age_max;
	}

	public void setRequired_age_max(int required_age_max) {
		this.required_age_max = required_age_max;
	}

	public int getRequired_min_level() {
		return required_min_level;
	}

	public void setRequired_min_level(int required_min_level) {
		this.required_min_level = required_min_level;
	}

	public int getRequired_max_level() {
		return required_max_level;
	}

	public void setRequired_max_level(int required_max_level) {
		this.required_max_level = required_max_level;
	}

	public int getRequired_gender() {
		return required_gender;
	}

	public void setRequired_gender(int required_gender) {
		this.required_gender = required_gender;
	}
	
	public Game(){
	}
}
