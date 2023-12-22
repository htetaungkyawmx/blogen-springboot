package com.example.blogenspringboot.dao;

import com.example.blogenspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
