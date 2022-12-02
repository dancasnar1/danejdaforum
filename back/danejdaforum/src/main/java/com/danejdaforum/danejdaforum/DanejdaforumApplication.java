package com.danejdaforum.danejdaforum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.danejdaforum.danejdaforum.model.Category;
import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.model.Thread;
import com.danejdaforum.danejdaforum.repository.ThreadRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories("com.danejdaforum.danejdaforum.*")
@ComponentScan("com.danejdaforum.danejdaforum.*")
@EntityScan("com.danejdaforum.danejdaforum.*")
public class DanejdaforumApplication implements CommandLineRunner{
	
	@Autowired
	private static ThreadRepository tr;

	public static void main(String[] args) {
		SpringApplication.run(DanejdaforumApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		Thread thread = new Thread();
		Post post1 = new Post(1l, "Title 1", "Test content 1", Category.CLARIFICATION, "imageUrl1", thread);
		Post post2 = new Post(2l, "Title 2", "Test content 2", Category.QUESTION, "imageUrl2", thread);
		Post post3 = new Post(3l, "Title 3", "Test content 3", Category.SUGGESTION, "imageUrl3", thread);
		thread.setPost(post1);
		thread.setPost(post2);
		thread.setPost(post3);
        tr.addPost(post1);
        tr.addPost(post2);
        tr.addPost(post3);
        
	}

}
