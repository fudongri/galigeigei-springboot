package org.galigeigei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.galigeigei.domain.User;

@Mapper
public interface UserMapper {
	
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> findAll();
}