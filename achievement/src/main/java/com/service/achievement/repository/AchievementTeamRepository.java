package com.service.achievement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.achievement.model.AchievementTeam;


public interface AchievementTeamRepository extends CrudRepository<AchievementTeam, Long> {
	@Query("SELECT t FROM AchievementTeam t WHERE t.id_team = ?1")
	List<AchievementTeam> findAchivmentByTeam(int id_team);

}
