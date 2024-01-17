package com.myblog7.myblog7.service;

import com.myblog7.myblog7.payload.SchoolDto;

import java.util.List;

public interface SchoolService {
    SchoolDto createSchoolRecord(SchoolDto schoolDto);

    SchoolDto getStudentById(long id);

    List<SchoolDto> getAllDetailes();
}
