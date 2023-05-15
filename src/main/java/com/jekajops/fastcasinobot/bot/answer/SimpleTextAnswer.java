package com.jekajops.fastcasinobot.bot.answer;

import java.util.Optional;

public interface SimpleTextAnswer extends Answer {
    @Override
    default Optional<String> getImage() {
        return Optional.empty();
    }

    @Override
    default Optional<String> getVideo() {
        return Optional.empty();
    }

    @Override
    default Optional<String> getAudio() {
        return Optional.empty();
    }

    @Override
    default Optional<String> getSticker() {
        return Optional.empty();
    }

    @Override
    default Optional<Answer> getNextAnswer() {
        return Optional.empty();
    }
}
