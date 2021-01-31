package com.learning.boot.learning.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService daoService;

	@GetMapping(path="/getusers")
	public List<User> getAllUser() {
		return daoService.findAll();

	}
	
	
	@GetMapping(path="/getuserbyid/{pId}")
	public User findUserById(@PathVariable Integer pId) {
		return daoService.findOne(new User(pId, null, null));
		
	}

}
