package com.nathan.discord_bot.sevices;

import com.nathan.discord_bot.utils.PropertiesManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class DiscordBotService {

    public static void run() throws LoginException {
        String token = new PropertiesManager().readProperty("bot.token");
        JDA jda = JDABuilder.createDefault(token).build();
    }

}
