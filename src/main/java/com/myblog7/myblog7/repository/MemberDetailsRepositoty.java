package com.myblog7.myblog7.repository;

import com.myblog7.myblog7.entity.MemberDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDetailsRepositoty extends JpaRepository<MemberDetails,Long> {
}
