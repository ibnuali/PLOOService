package com.service.match.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "line_up")
public class LineUp {
	
	@Id
	@Column(name = "id_line_up")
	private int id_line_up;
	
	@Column(name = "id_player")
	private int id_player;
	
	@Column(name = "id_games")
	private FriendlyMatch id_games;

	public int getId_line_up() {
		return id_line_up;
	}

	public void setId_line_up(int id_line_up) {
		this.id_line_up = id_line_up;
	}

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public FriendlyMatch getId_games() {
		return id_games;
	}

	public void setId_games(FriendlyMatch id_games) {
		this.id_games = id_games;
	}
	
	public LineUp(){
		
	}
}
