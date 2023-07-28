package com.example.spring_bot_skill.application;

import com.example.spring_bot_skill.infrastructure.persistence.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceImpl implements BotService{

    private final MemberRepository memberRepository;

}
