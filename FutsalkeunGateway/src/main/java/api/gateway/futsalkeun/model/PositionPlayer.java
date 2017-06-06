package api.gateway.futsalkeun.model;

public class PositionPlayer {

	 private int id_player;
	 
	 private Position short_position; 
	 
	 	/* Get Set Id Player*/
		public int getId_Player(){
			return id_player;
		}
		
		public void setId_Player(int id_player){
			this.id_player = id_player;
		}
		/*	----------------------------- */
		
		/* Get Set Short Position */
		public Position getShort_position(){
			return short_position;
		}
		
		public void setShort_position(Position short_position){
			this.short_position = short_position;
		}
		
		/*	----------------------------- */
	 
	 
}
