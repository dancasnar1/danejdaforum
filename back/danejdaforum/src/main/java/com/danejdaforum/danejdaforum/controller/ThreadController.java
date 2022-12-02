package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.service.PostService;
import com.danejdaforum.danejdaforum.service.ThreadService;

public class ThreadController {

	private ThreadService threadService;
	private PostService postService;
	
	@Autowired
    public ThreadController(final ThreadService threadService) {
        this.threadService = threadService;
    }
	
	@GetMapping("/")
    public List<Thread> findAllThreads() {
        return threadService.findAllThreads();
    }
	
	@PostMapping("/new")
    public String findAllThreads(@Valid Post post) {
		if (post.getId() == null || postService.findPostByTitle(post.getTitle()) != null) {
			return null;
		}
		threadService.addPost(post);
		return "/";
    }
}
