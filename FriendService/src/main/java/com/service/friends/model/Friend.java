package com.service.friends.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friend")
public class Friend {
	 @Id
	 @Column(name = "id_friend")
	 private int id_friend;
	 
	 @Column(name = "id_player1")
	 private int id_player1;
	 
	 @Column(name = "id_player2")
	 private int id_player2;
	 
	 /* Get Set Id Friend*/
	 public int getIdFriend() { 
		    return id_friend; 
	 } 
	 public void setIdFriend(int id_friend) { 
		    this.id_friend = id_friend; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Id Friend 1*/
	 public int getIdPlayer1() { 
		    return id_player1; 
	 } 
	 public void setIdPlayer1(int id_player1) { 
		    this.id_player1 = id_player1; 
	 }
	 /* ------------------------------ */
	 
	 /* Get Set Id Friend 2*/
	 public int getIdPlayer2() { 
		    return id_player2; 
	 } 
	 public void setIdPlayer2(int id_player2) { 
		    this.id_player2 = id_player2; 
	 }
	 /* ------------------------------ */
}
