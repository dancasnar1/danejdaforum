package com.danejdaforum.PairForum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danejdaforum.PairForum.model.Post;
import com.danejdaforum.PairForum.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	PostRepository postRepository;
	
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	public List<Post> getPostByThread(String thread) {
		return postRepository.findPostByThread(thread);
	}

	public Post getPostByTitle(String title) {
		return postRepository.findPostByTitle(title);
	}

	public void insertPost(Post p) {
		postRepository.insert(p);
	}
}
