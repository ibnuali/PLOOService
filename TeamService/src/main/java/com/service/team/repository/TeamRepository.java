package com.service.team.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.team.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
	
	@Query("SELECT t FROM Team t WHERE t.team_code = ?1")
	public Team findByCode(String team_code);
	
	@Query("SELECT t FROM Team t WHERE t.id_team = ?1")
	public Team findById(int id_team);
}
