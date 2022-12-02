package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;
import java.beans.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/posts/{title}")
    public ResponseEntity<Post> findPostByTitle(@PathVariable String title) {
		return new ResponseEntity<>(this.postService.findPostByTitle(title), HttpStatus.OK);
    }
	
	@PostMapping(value = "{threadId}/posts")
	public Post createTask(@RequestParam(name = "threadId") int threadId, @RequestParam(name = "title") String title,
			@RequestParam(name = "content") String content, @RequestParam(name = "category") String category,
			@RequestParam(name = "imageUrl") String imageUrl) {

		Post post = new Post(title, content, category, imageUrl);

		this.service.insertPost(post);
		return post;
	}
	
}
