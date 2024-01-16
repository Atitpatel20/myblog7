package com.myblog7.myblog7.service.Impl;

import com.myblog7.myblog7.entity.School;
import com.myblog7.myblog7.exception.ResourceNotFoundException;
import com.myblog7.myblog7.payload.SchoolDto;
import com.myblog7.myblog7.repository.SchoolRepository;
import com.myblog7.myblog7.service.SchoolService;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public SchoolDto createSchoolRecord(SchoolDto schoolDto) {
        School schools= new School();
        schools.setHod(schoolDto.getHod());
        schools.setTeachers(schoolDto.getTeachers());
        schools.setStudents(schoolDto.getStudents());
        School saveRecord = schoolRepository.save(schools);
        SchoolDto dto= new SchoolDto();
        dto.setHod(saveRecord.getHod());
        dto.setTeachers(saveRecord.getTeachers());
        dto.setStudents(saveRecord.getStudents());
        return dto;
    }

    @Override
    public SchoolDto getStudentById(long id) {
        School school = schoolRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Record not found with id: " + id)
        );
        SchoolDto dto= new SchoolDto();
        dto.setId(school.getId());
        dto.setHod(school.getHod());
        dto.setTeachers(school.getTeachers());
        dto.setStudents(school.getStudents());
        return dto;
    }
}
