package com.example.blogenspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    //255
    @Column(columnDefinition = "text")
    private String body;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePosted;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;



}
