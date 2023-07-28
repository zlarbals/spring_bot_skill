package com.example.spring_bot_skill.adapters.outbound;

import com.example.spring_bot_skill.application.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BotServiceAdapter implements BotService {

    private final BotService botService;

}
