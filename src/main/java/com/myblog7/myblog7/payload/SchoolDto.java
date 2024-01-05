package com.myblog7.myblog7.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {
    private long id;
    private int hod;
    private int teachers;
    private int students;
}
