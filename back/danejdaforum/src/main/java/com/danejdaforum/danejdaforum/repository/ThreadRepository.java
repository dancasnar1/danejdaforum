package com.danejdaforum.danejdaforum.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danejdaforum.danejdaforum.model.Thread;

@Repository
public interface ThreadRepository extends MongoRepository<Thread, Long>{

	@Query("{}")
	List<Thread> findAllThreads();
	

}
