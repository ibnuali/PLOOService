/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package com.service.player.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_player")
	 private int id_player;
	 
	 @Column(name = "id_city")
	 private int id_city;
	 
	 @Column(name = "gender")
	 private String gender;
	 
	 @Column(name = "player_first_name")
	 private String player_first_name;
	 
	 @Column(name = "player_last_name")
	 private String player_last_name;
	 
	 @Column(name = "player_nick_name")
	 private String player_nick_name;
	 
	 @Column(name = "player_photo")
	 private String player_photo;
	 
	 @Column(name = "player_birth_place")
	 private String player_birth_place;
	 
	 @Column(name = "player_birth_date")
	 private Date player_birth_date;
	 
	 @Column(name = "player_address")
	 private String player_address;
	 
	 @Column(name = "player_handphone", unique = true)
	 private String player_handphone;

	 @Column(name = "player_email", unique = true)
	 private String player_email;
	 
	 @Column(name = "player_username", unique = true)
	 private String player_username;
	 
	 @Column(name = "player_password")
	 private String player_password;
	 
	 @Column(name = "created_at")
	 private Timestamp created_at;
	 
	 @Column(name = "updated_at")
	 private Timestamp updated_at;

	public int getId_player() {
		return id_player;
	}

	public void setId_player(int id_player) {
		this.id_player = id_player;
	}

	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlayer_first_name() {
		return player_first_name;
	}

	public void setPlayer_first_name(String player_first_name) {
		this.player_first_name = player_first_name;
	}

	public String getPlayer_last_name() {
		return player_last_name;
	}

	public void setPlayer_last_name(String player_last_name) {
		this.player_last_name = player_last_name;
	}

	public String getPlayer_nick_name() {
		return player_nick_name;
	}

	public void setPlayer_nick_name(String player_nick_name) {
		this.player_nick_name = player_nick_name;
	}

	public String getPlayer_photo() {
		return player_photo;
	}

	public void setPlayer_photo(String player_photo) {
		this.player_photo = player_photo;
	}

	public String getPlayer_birth_place() {
		return player_birth_place;
	}

	public void setPlayer_birth_place(String player_birth_place) {
		this.player_birth_place = player_birth_place;
	}

	public Date getPlayer_birth_date() {
		return player_birth_date;
	}

	public void setPlayer_birth_date(Date player_birth_date) {
		this.player_birth_date = player_birth_date;
	}

	public String getPlayer_address() {
		return player_address;
	}

	public void setPlayer_address(String player_address) {
		this.player_address = player_address;
	}

	public String getPlayer_handphone() {
		return player_handphone;
	}

	public void setPlayer_handphone(String player_handphone) {
		this.player_handphone = player_handphone;
	}

	public String getPlayer_email() {
		return player_email;
	}

	public void setPlayer_email(String player_email) {
		this.player_email = player_email;
	}

	public String getPlayer_username() {
		return player_username;
	}

	public void setPlayer_username(String player_username) {
		this.player_username = player_username;
	}

	public String getPlayer_password() {
		return player_password;
	}

	public void setPlayer_password(String player_password) {
		this.player_password = player_password;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	 
	public Player(){
		
	}
}