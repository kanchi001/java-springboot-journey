package com.example.demospring.controller;

import com.example.demospring.model.Post;
import com.example.demospring.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> fetchPosts() {
        return postService.getPosts();
    }
}
