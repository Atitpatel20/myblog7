package com.myblog7.myblog7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String tittle;
    private String description;
    private String content;
}
