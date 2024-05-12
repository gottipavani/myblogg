package com.myblogg.service.impl;

import com.myblogg.entity.Post;
import com.myblogg.payload.PostDto;
import com.myblogg.repository.PostRepository;
import com.myblogg.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostServcieImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {


        Post post = mapToEntity(postDto);
        Post newPost = postRepository.save(post);
       PostDto newPostDto= mapToDto(newPost);
        return newPostDto;
    }

    Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }
   PostDto mapToDto(Post post)
    {
PostDto postDto=new PostDto();
postDto.setId(post.getId());
postDto.setTitle(post.getTitle());
postDto.setDescription(post.getDescription());
postDto.setContent(post.getContent());
return postDto;
    }

}