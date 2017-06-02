package com.service.friends.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.service.friends.model.Friend;


public interface FriendRepository extends CrudRepository<Friend, Long>{
	@Query("SELECT c FROM Friend c")
	List<Friend> findAll();
	
	@Query("SELECT pp FROM Friend pp WHERE pp.id_player1 = ?1")
	List<Friend> findFriendByPlayer1(int id_pla1yer);
	
	@Query("SELECT f2 FROM Friend f2 WHERE f2.id_player2 = ?1")
	List<Friend> findFriendByPlayer2(int id_player2);
}
