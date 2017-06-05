package com.service.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.game.model.Game;

public interface GameRepository extends CrudRepository<Game, Long>{
	
	@Query("SELECT g FROM Game g WHERE g.id_games = ?1")
	public Game findById(int id_games);
	
	@Query("SELECT g FROM Game g, JoinGame jg WHERE jg.id_player = ?1 AND jg.id_games = g.id_games")
	public List<Game> findByPlayer(int id_player);
}
