package org.galigeigei.service;

import java.util.List;

import org.galigeigei.domain.User;

/**
 * @author fudongri
 */
public interface UserService {

	List<User> findAll();

	User findById(int id);

	void update(User user);

	void add(User user);

	void deleteById(int id);
	

}
