package com.example.blogenspringboot.service;

import com.example.blogenspringboot.dao.CategoryDao;
import com.example.blogenspringboot.dao.PostDao;
import com.example.blogenspringboot.dao.UserDao;
import com.example.blogenspringboot.entity.Category;
import com.example.blogenspringboot.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final UserDao userDao;
    private final CategoryDao categoryDao;
    private final PostDao postDao;

    public void createUser(User user){
        userDao.save(user);
    }

    public List<Category> listAllCategories(){
        return categoryDao.findAll();
    }

    public void createCateogory(Category category){
        categoryDao.save(category);
    }

}
