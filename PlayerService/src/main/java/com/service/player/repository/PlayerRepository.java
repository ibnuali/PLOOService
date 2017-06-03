/*
 * Author : Fadhlan Ridhwanallah
 * Date : 31 Maret 2017
 * Modified : 4 Juni 2017
 */

package com.service.player.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.player.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{
	
	@Query("SELECT p FROM Player p WHERE p.id_player = ?1")
	Player findById(int _id_player);
	
	@Query("SELECT p FROM Player p WHERE p.player_username = ?1")
	Player findByUsername(String username);
	
	@Query("SELECT p FROM Player p WHERE p.player_username = ?1 AND p.player_password = ?2")
	Player findByUsernamePass(String username, String password);
	
	@Query("SELECT p FROM Player p")
	List<Player> findAll();
}
