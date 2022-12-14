package com.danejdaforum.danejdaforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danejdaforum.danejdaforum.model.Post;
import com.danejdaforum.danejdaforum.repository.PostRepository;
import com.house3sum.backTest.model.Task;

@Service
public class PostService {
	@Autowired
	PostRepository postRepository;

	
    @Autowired
    public PostService(final PostRepository postRepository) {
        this.postRepository = postRepository;
    }
	
    
    @Transactional(readOnly = true)
	public List<Post> findAllPostsByThreadId(int threadId) {
		return postRepository.findAllPostsByThreadId(threadId);
	}
    
    @Transactional(readOnly = true)
	public Post findPostByTitle(String title) {
    	List<Post> postsRes = postRepository.findPostByTitle(title);
		return postsRes.get(0);
	}
    
    @Transactional()
    public void addPost(Post post) {
    	postRepository.insert(post);
	}
    
}
