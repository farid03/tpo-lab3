package ru.ifmo.se.tpolab3.properties.reader;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config CONFIG = readConfig();
    String MAIN_PAGE_URL = readConfig().getString("pages.main.url");
    String BROWSER_EXTENSION_URL = readConfig().getString("pages.extension.url");
    String NEWS_PAGE_URL = readConfig().getString("pages.news.url");

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }
}