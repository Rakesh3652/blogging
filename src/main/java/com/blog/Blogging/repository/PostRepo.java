package com.blog.Blogging.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.Blogging.model.Post;

public interface PostRepo extends JpaRepository<Post,Integer>{

}
