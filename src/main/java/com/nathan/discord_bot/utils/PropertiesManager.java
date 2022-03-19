package com.nathan.discord_bot.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesManager {
        private final Properties properties;

        public PropertiesManager() {
            properties = new Properties();
            try {
                properties.load(getClass().getClassLoader().getResourceAsStream("app.properties"));

            } catch (IOException ioex) {
                Logger.getLogger(getClass().getName()).log(Level.ALL, "IOException Occured while loading properties file::::" +ioex.getMessage());
            }
        }

        public String readProperty(String keyName) {
            return properties.getProperty(keyName, "There is no key in the properties file");
        }
}
