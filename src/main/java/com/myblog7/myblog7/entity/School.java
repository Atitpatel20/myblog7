package com.myblog7.myblog7.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="schoolMemberDeatiles")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int hod;
    private int teachers;
    private int students;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
    private List<MemberDetails> memberDetails;
}
