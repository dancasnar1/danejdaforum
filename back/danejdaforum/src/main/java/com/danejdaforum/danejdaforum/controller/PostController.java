package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.service.PostService;

public class PostController {

	private PostService postService;
	
	@Autowired
    public PostController(final PostService postService) {
        this.postService = postService;
    }
	
	@GetMapping("/{threadId}")
    public List<Post> findAllPostsByThreadId(@PathVariable("threadId") int threadId) {
        return postService.findAllPostsByThreadId(threadId);
    }
	
}
