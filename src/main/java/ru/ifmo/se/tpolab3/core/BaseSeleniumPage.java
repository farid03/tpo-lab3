package ru.ifmo.se.tpolab3.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static void setDriver(final WebDriver webDriver){
        driver = webDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
}