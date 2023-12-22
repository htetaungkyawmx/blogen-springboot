package com.example.blogenspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Post> posts =
            new ArrayList<>();

    public void addPost(Post post){
        post.setCategory(this);
        posts.add(post);
    }




}
