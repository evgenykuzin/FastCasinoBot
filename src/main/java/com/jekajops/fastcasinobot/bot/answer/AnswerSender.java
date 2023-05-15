package com.jekajops.fastcasinobot.bot.answer;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.*;
import org.telegram.telegrambots.bots.AbsSender;
import org.telegram.telegrambots.exceptions.TelegramApiException;

@Component
public class AnswerSender implements IAnswerSender {

    private final AbsSender absSender;

    public AnswerSender(AbsSender absSender) {
        this.absSender = absSender;
    }

    @Override
    public void send(Answer answer) {
        if (answer.getText().isPresent()) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(answer.getChatId());
            sendMessage.setText(answer.getText().get());
            if (answer.getReplyKeyboardMarkup().isPresent()) {
                sendMessage.setReplyMarkup(answer.getReplyKeyboardMarkup().get());
            }
            executeMethod(sendMessage);
        }
        if (answer.getImage().isPresent()) {
            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setChatId(answer.getChatId());
            sendPhoto.setPhoto(answer.getImage().get());
            if (answer.getReplyKeyboardMarkup().isPresent()) {
                sendPhoto.setReplyMarkup(answer.getReplyKeyboardMarkup().get());
            }
            sendPhoto(sendPhoto);
        }
        if (answer.getVideo().isPresent()) {
            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(answer.getChatId());
            sendVideo.setVideo(answer.getVideo().get());
            if (answer.getReplyKeyboardMarkup().isPresent()) {
                sendVideo.setReplyMarkup(answer.getReplyKeyboardMarkup().get());
            }
            sendVideo(sendVideo);
        }
        if (answer.getAudio().isPresent()) {
            SendAudio sendAudio = new SendAudio();
            sendAudio.setChatId(answer.getChatId());
            sendAudio.setAudio(answer.getAudio().get());
            if (answer.getReplyKeyboardMarkup().isPresent()) {
                sendAudio.setReplyMarkup(answer.getReplyKeyboardMarkup().get());
            }
            sendAudio(sendAudio);
        }
        if (answer.getSticker().isPresent()) {
            SendSticker sendSticker = new SendSticker();
            sendSticker.setChatId(answer.getChatId());
            sendSticker.setSticker(answer.getAudio().get());
            if (answer.getReplyKeyboardMarkup().isPresent()) {
                sendSticker.setReplyMarkup(answer.getReplyKeyboardMarkup().get());
            }
            sendSticker(sendSticker);
        }
    }

    public void executeMethod(BotApiMethod<?> method) {
        try {
            absSender.execute(method);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendPhoto(SendPhoto sendPhoto) {
        try {
            absSender.sendPhoto(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendAudio(SendAudio sendAudio) {
        try {
            absSender.sendAudio(sendAudio);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendVideo(SendVideo sendVideo) {
        try {
            absSender.sendVideo(sendVideo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendSticker(SendSticker sendSticker) {
        try {
            absSender.sendSticker(sendSticker);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
