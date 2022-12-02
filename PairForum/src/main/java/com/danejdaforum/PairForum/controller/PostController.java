package com.danejdaforum.PairForum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danejdaforum.PairForum.model.Post;
import com.danejdaforum.PairForum.service.PostService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class PostController {
	@Autowired
	PostService postService;

	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllTask() {
		List<Post> lista = postService.getAllPosts();
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	/*@GetMapping(value = "/posts/{thread}")
	public ResponseEntity<List<Post>> getPostsByThread(@PathVariable String thread) {
		if (this.postService.getPostByThread(thread) == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			List<Post> lista = postService.getPostByThread(thread);
			return new ResponseEntity<>(lista, HttpStatus.OK);
		}
	}*/

	@GetMapping(value = "/posts/{title}")
	public ResponseEntity<Post> getPostsByTitle(@PathVariable String title) {
		if (this.postService.getPostByTitle(title) == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(this.postService.getPostByTitle(title), HttpStatus.OK);
		}
	}

	@PostMapping(value = "/posts")
	public Post createTask(@RequestParam(name = "thread") String thread, @RequestParam(name = "title") String title,
			@RequestParam(name = "category") String category, @RequestParam(name = "content") String content,
			@RequestParam(name = "registred") boolean registred) {

		Post post = new Post(thread, title, category, content, registred);

		this.postService.insertPost(post);
		return post;
	}
}
