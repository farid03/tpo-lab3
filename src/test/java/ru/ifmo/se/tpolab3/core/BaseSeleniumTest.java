package ru.ifmo.se.tpolab3.core;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    public void initDriver(final String browser) {
        AbstractDriverOptions<?> options = null;

        if ("chrome".equalsIgnoreCase(browser)) {
            options = new ChromeOptions();
        } else if ("firefox".equalsIgnoreCase(browser)) {
            options = new FirefoxOptions();
        }

        assert options != null;

        final var capabilities = new HashMap<String, Object>();
        capabilities.put("name", "Test badge...");
        capabilities.put("sessionTimeout", "15m");

        final var envs = new ArrayList<String>();
        envs.add("TZ=UTC");
        capabilities.put("env", envs);

        final var labels = new HashMap<String, Object>();
        labels.put("manual", "true");
        capabilities.put("labels", labels);

        capabilities.put("enableVideo", true);
        capabilities.put("enableVNC", true);

        options.setCapability("selenoid:options", capabilities);

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        } catch (MalformedURLException ignored) {

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}