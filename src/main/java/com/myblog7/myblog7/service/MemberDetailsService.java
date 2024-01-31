package com.myblog7.myblog7.service;

import com.myblog7.myblog7.payload.MemberDetailsDto;

public interface MemberDetailsService {
    MemberDetailsDto createMemberDetailes(MemberDetailsDto memberDetailsDto, long schoolId);

    void deleteMember(long id);

    MemberDetailsDto updateMember(long id, MemberDetailsDto memberDetailsDto, long schoolId);
}
