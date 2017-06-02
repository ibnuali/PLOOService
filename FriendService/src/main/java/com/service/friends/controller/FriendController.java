package com.service.friends.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.friends.model.Friend;
import com.service.friends.repository.FriendRepository;

@RestController
public class FriendController {
	@Autowired
	FriendRepository friendRepo;
	
	@RequestMapping(value="/findall/", method = RequestMethod.GET)
	public List<Friend> findAll(){
		return friendRepo.findAll();
	}
	
	@RequestMapping(value="/findfriendplayer1/{id_player1}", method = RequestMethod.GET)
	public List<Friend> findFriend1(@PathVariable int id_player1){	
		return friendRepo.findFriendByPlayer1(id_player1);
	}
	
	@RequestMapping(value="/findfriendplayer2/{id_player2}", method = RequestMethod.GET)
	public List<Friend> findFriendByPlayer2(@PathVariable int id_player2){	
		return friendRepo.findFriendByPlayer2(id_player2);
	}
}
