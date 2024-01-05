package com.myblog7.myblog7.controller;

import com.myblog7.myblog7.payload.SchoolDto;
import com.myblog7.myblog7.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
