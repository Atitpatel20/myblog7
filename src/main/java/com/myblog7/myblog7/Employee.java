package com.myblog7.myblog7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private long id;
    private String name;
    private double salary;
    private long dept_id;
}
