package com.example.demospring.service;

import com.example.demospring.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    private final RestTemplate restTemplate;
    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> getPosts() {
        Post[] posts = restTemplate.getForObject(API_URL, Post[].class);
        return Arrays.asList(posts);
    }
}
