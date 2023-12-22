package com.example.blogenspringboot.controller;

import com.example.blogenspringboot.entity.Category;
import com.example.blogenspringboot.entity.User;
import com.example.blogenspringboot.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BlogService blogService;

    @RequestMapping ({"/","/index"})
    public String welcome(Model model){
        model.addAttribute("category", new Category());
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save-user")
    public String saveUser(User user,BindingResult result){
        if (result.hasErrors()){
            return "index";
        }
        blogService.createUser(user);
        return "redirect:/";
    }

    @PostMapping("/save-category")
    public String saveCategory(Category category, BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        blogService.createCateogory(category);
        return "redirect:/";
    }

    @GetMapping("/list-category")
    public String listAllCategories(Model model){
        model.addAttribute("categories", blogService.listAllCategories());
        return "Categories";
    }
}
