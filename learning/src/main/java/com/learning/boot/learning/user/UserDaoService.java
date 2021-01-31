package com.learning.boot.learning.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	static private List<User> user = new ArrayList<>();
	private static int userCount = 3;

	static {
		user.add(new User(1, "jack", new Date()));
		user.add(new User(2, "Denial", new Date()));
		user.add(new User(3, "Dyna", new Date()));
	}

	public List<User> findAll() {
		return user;
	}

	public User save(User pUser) {
		if (pUser.getId() == null) {
			pUser.setId(++userCount);
			user.add(pUser);
		}
		return pUser;
	}

	public User findOne(User pUser) {
		for (User user : user) {
			if (user.getId() == pUser.getId()) {
				return user;
			}
		}
		return null;

	}

}
