package com.p139571jpa.back.post.service;


import com.p139571jpa.back.post.domain.Post;
import com.p139571jpa.back.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public long count(){
        return postRepository.count();
    }
    public Post save(Post post){
        return postRepository.save(post);
    }
    public Optional<Post> findById(int id){
        return postRepository.findById(id);
    }
}
