package com.service.rating.model;

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
@Table(name = "rating_history")
public class RatingHistory {
	@Id
	@Column(name = "id_rating_history")
	private int id_rating_history;
	
	@Column(name = "id_player")
	private int id_player;
	
	@Column(name = "id_games")
	private int id_games;
	
	@Column(name = "id_expert_judgement")
	private String id_expert_judgement;
	
	@Column(name = "player_give_rating")
	private int player_give_rating;
	
	@Column(name = "date_rating_history")
	private Date date_rating_history;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "score_rating")
	private Rating score_rating;
	
	@Autowired
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "short_rating_category")
	private RatingCategory short_rating_category;

	public int getId_rating_history() {
		return id_rating_history;
	}

	public void setId_rating_history(int id_rating_history) {
		this.id_rating_history = id_rating_history;
	}

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public int getId_games() {
		return id_games;
	}

	public void setId_games(int id_games) {
		this.id_games = id_games;
	}

	public String getId_expert_judgement() {
		return id_expert_judgement;
	}

	public void setId_expert_judgement(String id_expert_judgement) {
		this.id_expert_judgement = id_expert_judgement;
	}

	public int getPlayer_give_rating() {
		return player_give_rating;
	}

	public void setPlayer_give_rating(int player_give_rating) {
		this.player_give_rating = player_give_rating;
	}

	public Date getDate_rating_history() {
		return date_rating_history;
	}

	public void setDate_rating_history(Date date_rating_history) {
		this.date_rating_history = date_rating_history;
	}

	public Rating getScore_rating() {
		return score_rating;
	}

	public void setScore_rating(Rating score_rating) {
		this.score_rating = score_rating;
	}
	
	public RatingCategory getShort_rating_category() {
		return short_rating_category;
	}

	public void setShort_rating_category(RatingCategory short_rating_category) {
		this.short_rating_category = short_rating_category;
	}

	public RatingHistory(){
		
	}
	
	public RatingHistory(int _id_player, int _id_games, String _id_expert, int _player_give, Date _date_rating, Rating _score, RatingCategory _short_category){
		this.id_player = _id_player;
		this.id_games = _id_games;
		this.player_give_rating = _player_give;
		this.date_rating_history = _date_rating;
		this.score_rating = _score;
		this.short_rating_category = _short_category;
	}
}
