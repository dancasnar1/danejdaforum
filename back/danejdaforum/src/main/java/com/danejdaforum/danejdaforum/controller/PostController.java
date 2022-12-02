package com.danejdaforum.danejdaforum.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.beans.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.danejdaforum.model.Category;
import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.model.Thread;
import com.danejdaforum.danejdaforum.service.PostService;
import com.flights.demo.model.Flight;
import com.house3sum.backTest.model.Task;

@Controller
public class PostController {
	
	private final PostService postService;
	
    public PostController(PostService postService) {
        this.postService = postService;
    }
    
    @GetMapping("/{threadId}/posts/")
    public List<Post> findAllPostsByThreadId(@PathVariable("threadId") int threadId) {
        return postService.findAllPostsByThreadId(threadId);
    }
    
    @GetMapping("/posts/title/{}")
    public Post findPostByTitle(@PathVariable("title") String title) {
        return postService.findPostByTitle(title);
    }
    
    
    @PostMapping(value="/posts")
	public Post addPost(
			@RequestParam(name = "id") long id, 
			@RequestParam(name = "title") String title,
			@RequestParam(name = "content") String content,
			@RequestParam(name = "category") Category category,
			@RequestParam(name = "imageUrl") String imageUrl,
			@RequestParam(name = "thread") Thread thread) {
			
		Post post = new Post(id, title, content, category, imageUrl, thread);
		
		this.postService.addPost(post);
		return post;
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
