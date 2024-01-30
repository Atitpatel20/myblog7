package com.myblog7.myblog7.controller;

import com.myblog7.myblog7.entity.MemberDetails;
import com.myblog7.myblog7.payload.MemberDetailsDto;
import com.myblog7.myblog7.service.MemberDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/memberDetailes")
public class MemberDetailController {
    private MemberDetailsService memberDetailsService;
    public MemberDetailController(MemberDetailsService memberDetailsService) {
        this.memberDetailsService = memberDetailsService;
    }

    // http://localhost:8080/api/memberDetailes?schoolId=1
    @PostMapping
    public ResponseEntity<MemberDetailsDto>createMemberDetailes(
            @RequestBody MemberDetailsDto memberDetailsDto,
            @RequestParam long schoolId
    ){
        MemberDetailsDto dtos = memberDetailsService.createMemberDetailes(memberDetailsDto, schoolId);
        return new ResponseEntity<>(dtos, HttpStatus.CREATED);
    }
    // http://localhost:8080/api/memberDetailes/2
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteMember(@PathVariable long id){
        memberDetailsService.deleteMember(id);
        return new ResponseEntity<>("member is deleted",HttpStatus.OK);
    }
    // http://localhost:8080/api/memberDetailes/2
    @PutMapping("/{id}")
    public ResponseEntity<MemberDetailsDto>updateMember(@PathVariable long id,@RequestBody MemberDetailsDto memberDetailsDto){
        MemberDetailsDto dto= memberDetailsService.updateMember(id,memberDetailsDto);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
