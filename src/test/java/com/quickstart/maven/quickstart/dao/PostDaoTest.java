package com.quickstart.maven.quickstart.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.quickstart.maven.quickstart.model.Post;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostDaoTest {
	@Autowired
	private PostDao postDao;

	@Test
	public void savePostShouldReturnPost() {
		Post post = this.postDao.save(new Post("Testing"));
		assertEquals("Should save correct Post in DB", "Testing", post.getContent());
	}
}
