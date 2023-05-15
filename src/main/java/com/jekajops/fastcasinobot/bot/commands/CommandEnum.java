package com.jekajops.fastcasinobot.bot.commands;

public enum CommandEnum {
    START("start");

    private final String value;

    CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}