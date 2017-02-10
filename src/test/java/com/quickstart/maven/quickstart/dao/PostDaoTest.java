package com.quickstart.maven.quickstart.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.quickstart.maven.quickstart.App;
import com.quickstart.maven.quickstart.model.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class PostDaoTest {
	@Autowired
	private PostDao postDao;

	@Test
	public void savePostShouldReturnPost() {
		Post post = this.postDao.save(new Post("Testing"));
		assertEquals("Should save correct Post in DB", "Testing", post.getContent());
	}
}
