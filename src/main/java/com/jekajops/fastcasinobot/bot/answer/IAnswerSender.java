package com.jekajops.fastcasinobot.bot.answer;

import org.springframework.stereotype.Component;

@Component
public interface IAnswerSender {
    void send(Answer answer);
}
