/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package api.gateway.futsalkeun.model;

import java.sql.Timestamp;

public class RatingHistory {

	private int id_rating_history;
	
	private int id_player;
	
	private int id_games;
	
	private String id_expert_judgement;
	
	private int player_give_rating;

	private Timestamp date_rating_history;

	private Rating score_rating;
	
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

	public Timestamp getDate_rating_history() {
		return date_rating_history;
	}

	public void setDate_rating_history(Timestamp date_rating_history) {
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
	
	public RatingHistory(int _id_player, int _id_games, String _id_expert, int _player_give, Timestamp _date_rating, Rating _score, RatingCategory _short_category){
		this.id_player = _id_player;
		this.id_games = _id_games;
		this.id_expert_judgement  = _id_expert;
		this.player_give_rating = _player_give;
		this.date_rating_history = _date_rating;
		this.score_rating = _score;
		this.short_rating_category = _short_category;
	}
}
