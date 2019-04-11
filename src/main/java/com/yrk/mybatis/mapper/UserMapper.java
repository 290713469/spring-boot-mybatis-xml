/**
 * 
 */
package com.yrk.mybatis.mapper;

import java.util.List;

import com.yrk.mybatis.model.User;

/**
 * @author runkaiyang
 *
 */
public interface UserMapper {

	List<User> getAll();
	
	User getOne(Long id);
	
	void insert(User user);
	
	void update(User user);
	
	void delete(Long id);
}
