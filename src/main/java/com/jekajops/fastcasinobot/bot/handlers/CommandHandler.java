package com.jekajops.fastcasinobot.bot.handlers;

import com.jekajops.fastcasinobot.bot.answer.Answer;
import com.jekajops.fastcasinobot.bot.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class CommandHandler implements ICommandHandler {
    @Override
    public Answer handle(Command c) {
        String commandName = c.getName();
        // search command controller
        return null;
    }
}
