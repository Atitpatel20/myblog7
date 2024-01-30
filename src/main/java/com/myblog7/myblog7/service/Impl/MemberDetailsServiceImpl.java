package com.myblog7.myblog7.service.Impl;

import com.myblog7.myblog7.entity.MemberDetails;
import com.myblog7.myblog7.entity.School;
import com.myblog7.myblog7.exception.ResourceNotFoundException;
import com.myblog7.myblog7.payload.MemberDetailsDto;
import com.myblog7.myblog7.repository.MemberDetailsRepositoty;
import com.myblog7.myblog7.repository.SchoolRepository;
import com.myblog7.myblog7.service.MemberDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService {
    private SchoolRepository schoolRepository;

    private MemberDetailsRepositoty memberDetailsRepositoty;

    public MemberDetailsServiceImpl(SchoolRepository schoolRepository, MemberDetailsRepositoty memberDetailsRepositoty) {
        this.schoolRepository = schoolRepository;
        this.memberDetailsRepositoty = memberDetailsRepositoty;
    }

    @Override
    public MemberDetailsDto createMemberDetailes(MemberDetailsDto memberDetailsDto, long schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow(
                () -> new ResourceNotFoundException("Member not found with id:" + schoolId)
        );
        MemberDetails memberDetails= new MemberDetails();
        memberDetails.setRole(memberDetailsDto.getRole());
        memberDetails.setName(memberDetailsDto.getName());
        memberDetails.setSchool(school);
        MemberDetails savedMemberDetailes = memberDetailsRepositoty.save(memberDetails);

        MemberDetailsDto dto= new MemberDetailsDto();
        dto.setId(savedMemberDetailes.getId());
        dto.setName(savedMemberDetailes.getName());
        dto.setRole(savedMemberDetailes.getRole());
        return dto;
    }

    @Override
    public void deleteMember(long id) {
        memberDetailsRepositoty.deleteById(id);
    }
    @Override
    public MemberDetailsDto updateMember(long id, MemberDetailsDto memberDetailsDto) {
        MemberDetails memberDetails = memberDetailsRepositoty.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Member not found with id" + id)
        );
        memberDetails.setId(memberDetailsDto.getId());
        memberDetails.setRole(memberDetailsDto.getRole());
        memberDetails.setName(memberDetailsDto.getName());
        MemberDetails update = memberDetailsRepositoty.save(memberDetails);

        MemberDetailsDto dto= new MemberDetailsDto();
        dto.setId(update.getId());
        dto.setName(update.getName());
        dto.setRole(update.getRole());
        return dto;
    }
}
