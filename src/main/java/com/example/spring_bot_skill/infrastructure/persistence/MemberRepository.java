package com.example.spring_bot_skill.infrastructure.persistence;

import com.example.spring_bot_skill.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
