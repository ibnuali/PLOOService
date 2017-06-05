package com.service.achievement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.achievement.model.AchievementPlayer;

public interface AchievementPlayerRepository extends CrudRepository<AchievementPlayer, Long>{
	@Query("SELECT p FROM AchievementPlayer p WHERE p.id_player = ?1")
	List<AchievementPlayer> findAchivmentByPlayer(int id_player);
}
