package com.service.position.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.position.model.Position;;

@Entity
@Table(name="player_position")
public class PositionPlayer {
	 @Id 
	 @Column(name = "id_player") 
	 private int id_player;
	 
	 @Autowired 
	 @ManyToOne(fetch=FetchType.EAGER) 
	 @JoinColumn(name = "short_position") 
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
