package com.jekajops.fastcasinobot.bot.answer;

import java.util.Optional;

public class SimpleTextAnswerImpl implements SimpleTextAnswer {
    private final String text;

    public SimpleTextAnswerImpl(String text) {
        this.text = text;
    }

    @Override
    public Optional<String> getText() {
        return Optional.of(text);
    }
}
