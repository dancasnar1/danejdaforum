package com.danejdaforum.danejdaforum.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danejdaforum.danejdaforum.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{

	void addPost(Post post);
	
	List<Post> findAllPostsByThreadId(int threadId);
	
	Post findPostByTitle(String title);
	
}
