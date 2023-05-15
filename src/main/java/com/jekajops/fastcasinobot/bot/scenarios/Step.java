package com.jekajops.fastcasinobot.bot.scenarios;

import com.jekajops.fastcasinobot.bot.answer.Answer;

import java.util.Optional;
import java.util.UUID;

public interface Step {
    UUID stepUUID();
    <S> Answer execute(S o);
    Optional<Step> nextStep();
}
