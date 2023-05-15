package com.jekajops.fastcasinobot.bot.answer;

import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;

import java.util.Optional;

public interface Answer {
    Long getChatId();
    Optional<String> getText();
    Optional<String> getImage();
    Optional<String> getVideo();
    Optional<String> getAudio();
    Optional<String> getSticker();
    Optional<Answer> getNextAnswer();
    Optional<ReplyKeyboardMarkup> getReplyKeyboardMarkup();
    Optional<InlineKeyboardMarkup> getInlineKeyboardMarkup();
}
