package org.galigeigei.service.impl;

import java.util.List;

import org.galigeigei.dao.UserMapper;
import org.galigeigei.domain.User;
import org.galigeigei.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author fudongri
 */
@Service
public class UserServiceImpl implements UserService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserMapper userMapper;

	@Cacheable(value = "users")
	@Override
	public List<User> findAll() {
		List<User> users = userMapper.findAll();
		return users;
	}

	@Cacheable(value = "user")
	@Override
	public User findById(int id) {
		logger.debug("find user by id:{}", id);
		return userMapper.selectByPrimaryKey(id);
	}

	@CacheEvict(value = { "users", "user" }, allEntries = true)
	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@CacheEvict(value = { "users" }, allEntries = true)
	@Override
	public void add(User user) {
		userMapper.insertSelective(user);
	}

	@CacheEvict(value = { "users", "user" }, allEntries = true)
	@Override
	public void deleteById(int id) {
		userMapper.deleteByPrimaryKey(id);
	}

}
