package com.example.blogenspringboot.dao;

import com.example.blogenspringboot.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post, Integer> {
}
