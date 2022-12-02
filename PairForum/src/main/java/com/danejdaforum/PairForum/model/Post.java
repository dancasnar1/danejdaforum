package com.danejdaforum.PairForum.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id;
	private String thread;
	private String title;
	private String category;
	private String content;
	private boolean registred;

	public Post(String thread, String title, String category, String content, boolean registred) {
		this.thread = thread;
		this.title = title;
		this.category = category;
		this.content = content;
		this.registred = registred;
	}

	public Post() {}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isRegistred() {
		return registred;
	}

	public void setRegistred(boolean registred) {
		this.registred = registred;
	}
}
