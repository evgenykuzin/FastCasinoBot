package com.jekajops.fastcasinobot.bot;

import com.jekajops.fastcasinobot.bot.handlers.ICommandHandler;
import org.springframework.context.annotation.Bean;

public class BotSpringConfiguration {
    @Bean
    ICommandHandler commandHandler() {
        return s -> {
            return null;
        };
    }
}
