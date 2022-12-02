package com.danejdaforum.danejdaforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danejdaforum.danejdaforum.repository.ThreadRepository;
import com.danejdaforum.danejdaforum.model.Thread;

@Service
public class ThreadService {
	
	@Autowired
	ThreadRepository threadRepository;
	
    @Autowired
    public ThreadService(final ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;
    }
    
    
    @Transactional(readOnly = true)
	public List<Thread> findAllThreads() {
		return threadRepository.findAllThreads();
	}
    /*
    @Transactional()
    public void addPost(Post post) {
    	threadRepository.addPost(post);
    }*/
    
}
