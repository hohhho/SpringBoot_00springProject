package com.myproject.springProject.member.repository;

import com.myproject.springProject.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 기본적인 CRUD는 JpaRepository를 상속받는 것만으로도 가능

    // loginId로 찾는 쿼리 자동 생성
    Optional<Member> findByLoginId(String loginId);
}
