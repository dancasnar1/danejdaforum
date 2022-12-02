package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.danejdaforum.service.PostService;
import com.danejdaforum.danejdaforum.service.ThreadService;
import com.danejdaforum.danejdaforum.model.Thread;

@Controller
public class ThreadController {
    
	public ThreadService threadService;
	public PostService postService;
	
	@Autowired
    public ThreadController(final ThreadService threadService) {
        this.threadService = threadService;
    }
	
	
	@GetMapping("/")
    public List<Thread> findAllThreads() {
        return threadService.findAllThreads();
    }
	/*
	@PostMapping("/new")
    public String findAllThreads(@Valid Post post) {
		if (post.getId() == null || postService.findPostByTitle(post.getTitle()) != null) {
			return null;
		}
		threadService.addPost(post);
		return "/";
    }
	*/
}
