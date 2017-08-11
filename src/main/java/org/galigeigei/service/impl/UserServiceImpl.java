package org.galigeigei.service.impl;

import java.util.List;

import org.galigeigei.dao.UserMapper;
import org.galigeigei.domain.User;
import org.galigeigei.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	
/**
 * @author fudongri
 */
@Service
public class UserServiceImpl implements UserService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public User findById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void add(User user) {
		userMapper.insertSelective(user);
	}

	@Override
	public void deleteById(int id) {
		userMapper.deleteByPrimaryKey(id);
	}

}
