package ru.ifmo.se.tpolab3.properties.reader;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config CONFIG = readConfig();
    String URL = readConfig().getString("url");
    String EXTENSION_URL = readConfig().getString("extensionUrl");
    String USER_LOGIN = readConfig().getString("usersParams.user.login");


    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }
}