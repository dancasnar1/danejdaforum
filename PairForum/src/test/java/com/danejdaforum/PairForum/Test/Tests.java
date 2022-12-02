package com.danejdaforum.PairForum.Test;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.danejdaforum.PairForum.controller.PostController;
import com.danejdaforum.PairForum.model.Post;
import com.danejdaforum.PairForum.service.PostService;
 

@WebMvcTest(controllers=PostController.class)
public class Tests {
	
	@MockBean
    private PostService postService;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        Post post = new Post();
        post.setThread("Test Thread 1");
        post.setTitle("My Test Post Title 1");
        post.setCategory("Test category 1");
        post.setContent("Test content 1");
        post.setRegistred(true);
        given(this.postService.getAllPosts()).willReturn(Lists.newArrayList(post));
    }

    @Test
    void testfindPosts() throws Exception {
        mockMvc.perform(get("/posts")).andExpect(status().isOk());
    }

    @Test
    void testFindPostsByTitle() throws Exception {
    	Post post = new Post();
        post.setThread("Test thread 1");
        post.setTitle("My Test Post Title 1");
        post.setCategory("Test category 1");
        post.setContent("Test content 1");
        post.setRegistred(true);
        given(this.postService.getPostByThread(post.getTitle())).willReturn(Lists.newArrayList(post));

        mockMvc.perform(get("/posts")).andExpect(status().isOk());
    }

    @Test
    public void testAddPost() throws Exception {
        mockMvc.perform(post("/posts")
                    .param("thread", "reddit")
                    .param("title", "reddit title")
                    .param("category", "random")
                    .param("content", "Nothing to see here")
                    .param("registred", "true"))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddWrongPost() throws Exception {
        mockMvc.perform(post("/posts")
                    .param("thread", "reddit")
                    .param("title", "reddit title")
                    .param("category", "random")
                    .param("content", "Nothing to see here"))
                .andExpect(status().is4xxClientError());
    }
}
