package com.myblogg.controller;

import com.myblogg.payload.PostDto;
import com.myblogg.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
     public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto)
    {
        PostDto dto = postService.createPost(postDto);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
