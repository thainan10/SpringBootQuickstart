package com.quickstart.maven.quickstart.dao;

import org.springframework.data.repository.CrudRepository;

import com.quickstart.maven.quickstart.model.Post;

public interface PostDao extends CrudRepository<Post, Long> {

}
