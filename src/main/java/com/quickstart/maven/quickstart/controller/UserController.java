package com.quickstart.maven.quickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quickstart.maven.quickstart.dao.UserDao;
import com.quickstart.maven.quickstart.model.User;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/users/create", method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return new ResponseEntity<User>(this.userDao.save(user), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		return new ResponseEntity<User>(this.userDao.findOne(id), HttpStatus.OK);
	}
}
