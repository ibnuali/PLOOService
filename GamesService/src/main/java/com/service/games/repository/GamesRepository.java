package com.service.games.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.games.model.Games;

public interface GamesRepository extends CrudRepository<Games, Long>{
	
	@Query("SELECT gs FROM Games gs WHERE gs.id_games = ?1")
	public Games findById(int id_games);
}
