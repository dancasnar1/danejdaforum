package com.danejdaforum.PairForum.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.danejdaforum.PairForum.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("{'thread':?0}")
	List<Post> findPostByThread(String thread);

	@Query("{'title': ?0}")
	Post findPostByTitle(String title);

	
}
