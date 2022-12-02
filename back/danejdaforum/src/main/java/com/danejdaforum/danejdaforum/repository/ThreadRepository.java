package com.danejdaforum.danejdaforum.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danejdaforum.danejdaforum.model.Post;

@Repository
public interface ThreadRepository extends CrudRepository<Thread, Long>{

	List<Thread> findAllThreads();
	
	void addPost(Post post);
}
