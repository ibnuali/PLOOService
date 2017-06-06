package com.service.game.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.game.model.JoinGame;

public interface JoinGameRepository extends CrudRepository<JoinGame, Long>{
	
	@Query("SELECT jg FROM JoinGame jg WHERE jg.id_games = ?1")
	public JoinGame findById(int id_game);
}
