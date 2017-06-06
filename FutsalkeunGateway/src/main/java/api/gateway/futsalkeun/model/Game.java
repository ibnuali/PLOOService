package api.gateway.futsalkeun.model;

public class Game extends Games{

	private int id_player;

	private int required_age_min;

	private int required_age_max;
	
	private int required_min_level;
	
	private int required_max_level;
	
	private int required_gender;

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
