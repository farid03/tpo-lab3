package ru.ifmo.se.tpolab3.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseSeleniumPage(final WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}