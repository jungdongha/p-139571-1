package com.p139571jpa.back.post.repository;

import com.p139571jpa.back.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
