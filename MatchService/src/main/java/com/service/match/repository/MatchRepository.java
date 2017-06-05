package com.service.match.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.match.model.FriendlyMatch;

public interface MatchRepository extends CrudRepository<FriendlyMatch,Long>{

	@Query("SELECT fm FROM FriendlyMatch fm WHERE fm.id_games = ?1")
	public FriendlyMatch findById(int id_games);
	
	@Query("SELECT fm FROM FriendlyMatch fm, LineUp lu WHERE lu.id_player = ?1 AND lu.id_games = fm.id_games")
	public List<FriendlyMatch> findByPlayer(int id_player);
}
