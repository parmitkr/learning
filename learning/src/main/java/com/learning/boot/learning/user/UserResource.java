package com.learning.boot.learning.user;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService daoService;

	@GetMapping(path = "/getusers")
	public List<User> getAllUser() {
		return daoService.findAll();

	}

	@GetMapping(path = "/getuserbyid/{pId}")
	public User findUserById(@PathVariable Integer pId) {
		User foundUser = daoService.findOne(new User(pId, null, null));
		if (foundUser == null) {
			throw new UserNotFoundException("id-" + pId);

		} else {
			return foundUser;
		}

	}

	@PostMapping(path = "/postuser")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User pUser) {
		User savedUser = daoService.save(pUser);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path="deleteuser/{pId}")
	public void deleteUser(@PathVariable int pId){
		User user=daoService.deleteUserById(pId);
		if(user==null) {
			throw new UserNotFoundException("id-"+pId);
		}
	}

}
