package api.gateway.futsalkeun.model;

public class FriendlyMatch extends Games{
	
	private int id_home_team;

	private int id_away_team;

	private int home_team_final_score;

	private int away_team_final_score;

	public int getId_home_team() {
		return id_home_team;
	}


	public void setId_home_team(int id_home_team) {
		this.id_home_team = id_home_team;
	}


	public int getId_away_team() {
		return id_away_team;
	}


	public void setId_away_team(int id_away_team) {
		this.id_away_team = id_away_team;
	}


	public int getHome_team_final_score() {
		return home_team_final_score;
	}


	public void setHome_team_final_score(int home_team_final_score) {
		this.home_team_final_score = home_team_final_score;
	}


	public int getAway_team_final_score() {
		return away_team_final_score;
	}


	public void setAway_team_final_score(int away_team_final_score) {
		this.away_team_final_score = away_team_final_score;
	}


	public FriendlyMatch(){
		 
	}
}
