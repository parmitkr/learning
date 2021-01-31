package com.learning.boot.learning.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	static private List<User> users = new ArrayList<>();
	private static int userCount = 3;

	static {
		users.add(new User(1, "jack", new Date()));
		users.add(new User(2, "Denial", new Date()));
		users.add(new User(3, "Dyna", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User pUser) {
		if (pUser.getId() == null) {
			pUser.setId(++userCount);
			users.add(pUser);
		}
		return pUser;
	}

	public User findOne(User pUser) {
		for (User user : users) {
			if (user.getId() == pUser.getId()) {
				return user;
			}
		}
		return null;

	}

	public User deleteUserById(Integer pId) {
		Iterator<User> iterator = users.iterator();

		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == pId) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
