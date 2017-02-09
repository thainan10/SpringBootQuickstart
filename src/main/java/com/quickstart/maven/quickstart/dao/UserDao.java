package com.quickstart.maven.quickstart.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.quickstart.maven.quickstart.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	public User findByEmail(String email);
}
