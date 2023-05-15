package com.jekajops.fastcasinobot.bot.handlers;

import com.jekajops.fastcasinobot.bot.answer.Answer;

public interface ITelegramHandler<T> {
    Answer handle(T t);
}
