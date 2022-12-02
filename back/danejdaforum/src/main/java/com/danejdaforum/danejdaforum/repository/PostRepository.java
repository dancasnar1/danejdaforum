package com.danejdaforum.danejdaforum.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.danejdaforum.danejdaforum.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Long>{
	
	List<Post> findAllPostsByThreadId(int threadId);
	
	@Query("{'title': ?0}")
	Post findPostByTitle(String title);
	
}
