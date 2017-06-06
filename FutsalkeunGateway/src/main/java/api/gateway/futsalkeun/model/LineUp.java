package api.gateway.futsalkeun.model;

public class LineUp {
	
	private int id_line_up;
	
	private int id_player;
	
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
