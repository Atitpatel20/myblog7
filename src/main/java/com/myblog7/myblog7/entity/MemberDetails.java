package com.myblog7.myblog7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="memberDetails")
public class MemberDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String role;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}
