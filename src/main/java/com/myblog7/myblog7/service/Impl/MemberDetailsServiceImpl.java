package com.myblog7.myblog7.service.Impl;

import com.myblog7.myblog7.entity.MemberDetails;
import com.myblog7.myblog7.entity.School;
import com.myblog7.myblog7.exception.ResourceNotFoundException;
import com.myblog7.myblog7.payload.MemberDetailsDto;
import com.myblog7.myblog7.repository.MemberDetailsRepositoty;
import com.myblog7.myblog7.repository.SchoolRepository;
import com.myblog7.myblog7.service.MemberDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService {
    private SchoolRepository schoolRepository;

    private MemberDetailsRepositoty memberDetailsRepositoty;
    private ModelMapper modelMapper;

    public MemberDetailsServiceImpl(SchoolRepository schoolRepository, MemberDetailsRepositoty memberDetailsRepositoty,ModelMapper modelMapper) {
        this.schoolRepository = schoolRepository;
        this.memberDetailsRepositoty = memberDetailsRepositoty;
        this.modelMapper=modelMapper;
    }


    @Override
    public MemberDetailsDto createMemberDetailes(MemberDetailsDto memberDetailsDto, long schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow(
                () -> new ResourceNotFoundException("Member not found with id:" + schoolId)
        );
        MemberDetails memberDetails = mapToEntity(memberDetailsDto);
//        MemberDetails memberDetails= new MemberDetails();
//        memberDetails.setRole(memberDetailsDto.getRole());
//        memberDetails.setName(memberDetailsDto.getName());
        memberDetails.setSchool(school);
        MemberDetails savedMemberDetailes = memberDetailsRepositoty.save(memberDetails);

//        MemberDetailsDto dto= new MemberDetailsDto();
//        dto.setId(savedMemberDetailes.getId());
//        dto.setName(savedMemberDetailes.getName());
//        dto.setRole(savedMemberDetailes.getRole());
        return mapToDto(savedMemberDetailes);
    }

    @Override
    public void deleteMember(long id) {
        memberDetailsRepositoty.deleteById(id);
    }
    @Override
    public MemberDetailsDto updateMember(long id, MemberDetailsDto memberDetailsDto, long schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow(
                () -> new ResourceNotFoundException("School not found with id" + schoolId)
        );
        MemberDetails memberDetails = memberDetailsRepositoty.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Member not found with id" + id)
        );
        MemberDetails m = mapToEntity(memberDetailsDto);
        m.setId(memberDetails.getId());
        m.setSchool(school);
//        memberDetails.setId(memberDetailsDto.getId());
//        memberDetails.setRole(memberDetailsDto.getRole());
//        memberDetails.setName(memberDetailsDto.getName());
        MemberDetails update = memberDetailsRepositoty.save(m);

//        MemberDetailsDto dto= new MemberDetailsDto();
//        dto.setId(update.getId());
//        dto.setName(update.getName());
//        dto.setRole(update.getRole());
        return mapToDto(update);
    }
    MemberDetailsDto mapToDto(MemberDetails memberDetails){
        MemberDetailsDto dto = modelMapper.map(memberDetails, MemberDetailsDto.class);
        return dto;
    }
    MemberDetails mapToEntity(MemberDetailsDto memberDetailsDto){
        MemberDetails memberDetails = modelMapper.map(memberDetailsDto, MemberDetails.class);
        return memberDetails;
    }
}
