package com.quickstart.maven.quickstart.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.quickstart.maven.quickstart.model.Post;

public class PostDaoTest {
	@Autowired
	private PostDao postDao;

	@Test
	public void savePostShouldReturnPost() {
		Post post = this.postDao.save(new Post("Testing"));
		assertEquals("Testing", post.getContent());
	}
}
