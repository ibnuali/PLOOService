package com.service.game.model;

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
@Table(name = "join_game")
public class JoinGame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_join_game")
	private int id_join_game;
	
	@Column(name = "id_player")
	private int id_player;
	
	public int getId_join_game() {
		return id_join_game;
	}
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_games")
	private Game id_games;
	
	@Column(name = "date_join_room")
	private Timestamp date_join_room;

	public void setId_join_game(int id_join_game) {
		this.id_join_game = id_join_game;
	}

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public Game getId_games() {
		return id_games;
	}

	public void setId_games(Game id_games) {
		this.id_games = id_games;
	}

	public Timestamp getDate_join_room() {
		return date_join_room;
	}

	public void setDate_join_room(Timestamp date_join_room) {
		this.date_join_room = date_join_room;
	}
}
