package com.jekajops.fastcasinobot.bot;

import com.jekajops.fastcasinobot.bot.handlers.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

@Component
public class FastCasinoBot extends TelegramLongPollingBot {
    @Value("bot.username")
    private String botUsername;
    @Value("bot.token")
    private String botToken;

    @Autowired
    private CommandHandler commandHandler;

    @Override
    public void onUpdateReceived(Update update) {
        commandHandler.handle(() -> update.getMessage().getText());
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
