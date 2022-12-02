package com.danejdaforum.danejdaforum.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepository extends CrudRepository<Thread, Long>{

	@Query("{}")
	List<Thread> findAllThreads();
	
	//void addPost(Post post);
}
