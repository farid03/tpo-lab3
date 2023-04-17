package ru.ifmo.se.tpolab3.core;

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(final WebDriver webDriver){
        driver = webDriver;
    }
}