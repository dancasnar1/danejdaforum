package com.danejdaforum.danejdaforum.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    public Long id;

    @NotNull
    @Size(min = 3, max = 40)
    public String title;

    @NotNull
    @Size(min = 5, max = 5000)
    public String content;
    
    public Category category;

    public String imageUrl;
    
    @ManyToOne
    public Thread thread;

	public Post(Long id, @NotNull @Size(min = 3, max = 40) String title,
			@NotNull @Size(min = 5, max = 5000) String content, Category category, String imageUrl, Thread thread) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thread = thread;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}
    
}
