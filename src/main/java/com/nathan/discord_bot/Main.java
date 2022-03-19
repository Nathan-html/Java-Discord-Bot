package com.nathan.discord_bot;

import com.nathan.discord_bot.sevices.DiscordBotTesting;
import com.nathan.discord_bot.sevices.DiscordBotService;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        // DiscordBotTesting.run();
        DiscordBotService.run();
    }
}
