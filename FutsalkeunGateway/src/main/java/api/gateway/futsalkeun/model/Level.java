package api.gateway.futsalkeun.model;

public class Level {

	 private int score_level; 

	 private int score_exp; 

	 private LevelCategory name_category; 
	 
	 /* Get Set Score Level*/
	 public int getScoreLevel() { 
		    return score_level; 
	 } 
	 public void setScoreLevel(int score_level) { 
		    this.score_level = score_level; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Name Player Achievement*/
	 public int getScoreExp() { 
		    return score_exp; 
	 } 
	 public void setScorExp(int score_exp) { 
		    this.score_exp = score_exp; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Short Position */
		public LevelCategory getNameCategory(){
			return name_category;
		}
		
		public void setNameCategory(LevelCategory name_category){
			this.name_category = name_category;
		}
		
	/*	----------------------------- */
}
