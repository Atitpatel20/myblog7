package com.myblog7.myblog7.controller;

import com.myblog7.myblog7.payload.SchoolDto;
import com.myblog7.myblog7.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    public ResponseEntity<SchoolDto> createSchoolRecord(@RequestBody SchoolDto SchoolDto){
      SchoolDto schoolRecord = schoolService.createSchoolRecord(SchoolDto);
        return new ResponseEntity<>(schoolRecord, HttpStatus.CREATED);
    }
    @GetMapping("/particular")
    public ResponseEntity<SchoolDto> getStudentById(@RequestParam long id){
        SchoolDto dto = schoolService.getStudentById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    // http://localhost:8080/api/schools?pageNo=0&pageSize=3&sortBy=students&sortDir=asc
    @GetMapping
    public List<SchoolDto> getAllDetailes(
            @RequestParam(name="pageNo",required = false,defaultValue = "0")int pageNo,
            @RequestParam(name="pageSize",required = false,defaultValue = "3")int pageSize,
            @RequestParam(name="sortBy",required = false,defaultValue = "id")String sortBy,
            @RequestParam(name="sortDir",required = false,defaultValue = "asc")String sortDir
    ) {
        List<SchoolDto> schoolDtos = schoolService.getAllDetailes(pageNo,pageSize,sortBy,sortDir);
        return schoolDtos;
    }

}
