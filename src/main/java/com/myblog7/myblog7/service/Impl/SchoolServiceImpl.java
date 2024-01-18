package com.myblog7.myblog7.service.Impl;

import com.myblog7.myblog7.entity.School;
import com.myblog7.myblog7.exception.ResourceNotFoundException;
import com.myblog7.myblog7.payload.SchoolDto;
import com.myblog7.myblog7.repository.SchoolRepository;
import com.myblog7.myblog7.service.SchoolService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public SchoolDto createSchoolRecord(SchoolDto schoolDto) {
        School schools = mapToEntity(schoolDto);

        School saveRecord = schoolRepository.save(schools);
        SchoolDto dto = mapToDto(saveRecord);
        return dto;
    }

    @Override
    public SchoolDto getStudentById(long id) {
        School school = schoolRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Record not found with id: " +id)
        );
        SchoolDto dto = mapToDto(school);
        return dto;
    }
    @Override
    public List<SchoolDto> getAllDetailes(int pageNo, int pageSize) {
        Pageable pageable=PageRequest.of(pageNo,pageSize);
        Page<School> pageSchools = schoolRepository.findAll(pageable);
        List<School> detailes = pageSchools.getContent();
        List<SchoolDto> dtos = detailes.stream().map(s -> mapToDto(s)).collect(Collectors.toList());
        return dtos;
    }
   SchoolDto mapToDto(School school){
       SchoolDto dto= new SchoolDto();
       dto.setId(school.getId());
       dto.setStudents(school.getStudents());
       dto.setTeachers(school.getTeachers());
       dto.setHod(school.getHod());
        return dto;
    }
    School mapToEntity(SchoolDto schoolDto){
        School school= new School();
        school.setId(schoolDto.getId());
        school.setStudents(schoolDto.getStudents());
        school.setTeachers(schoolDto.getTeachers());
        school.setHod(schoolDto.getHod());
        return school;
    }
}
