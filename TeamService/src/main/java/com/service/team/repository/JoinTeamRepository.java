package com.service.team.repository;

import java.util.List;
import com.service.team.model.JoinTeam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JoinTeamRepository extends CrudRepository<JoinTeam, Long>{
	
	@Query("SELECT jt FROM JoinTeam jt, Team t WHERE t.id_team = ?1 AND t.id_team = jt.id_team")
	List<JoinTeam>findByTeam(int id_team);
	
	@Query("SELECT jt FROM JoinTeam jt WHERE jt.id_player=?1")
	List<JoinTeam>findByPlayer(int id_player);
}
