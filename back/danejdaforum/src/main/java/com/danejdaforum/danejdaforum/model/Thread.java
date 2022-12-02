package com.danejdaforum.danejdaforum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "threads")
public class Thread {
	
	@Id
    @GeneratedValue
    public Long id;
	
	@OneToMany
    public Post post;

	public Thread(Long id, Post post) {
		super();
		this.id = id;
		this.post = post;
	}
	
	public Thread() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
	

}
