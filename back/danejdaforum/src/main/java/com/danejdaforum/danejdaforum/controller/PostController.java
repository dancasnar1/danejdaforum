package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;
import java.beans.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.service.PostService;

@Controller
public class PostController {
	
	private final PostService postService;
	
    public PostController(PostService postService) {
        this.postService = postService;
    }
    
	@GetMapping("/posts")
    public List<Post> findAllPostsByThreadId(@PathVariable("threadId") int threadId) {
        return postService.findAllPostsByThreadId(threadId);
    }
	
}
