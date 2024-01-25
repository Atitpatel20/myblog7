package com.myblog7.myblog7.service;

import com.myblog7.myblog7.payload.MemberDetailsDto;

public interface MemberDetailsService {
    MemberDetailsDto createMemberDetailes(MemberDetailsDto memberDetailsDto, long schoolId);
}
