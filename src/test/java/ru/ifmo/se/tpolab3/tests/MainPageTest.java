package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;


class MainPageTest extends BaseSeleniumTest {

    // прецедент 1
    @ParameterizedTest
    @ValueSource(classes = { ChromeDriver.class, FirefoxDriver.class })
    void search(Class<? extends WebDriver> webDriverClass) throws InterruptedException {
        setUpDriver(webDriverClass);

        final String city = "Тольятти";

        final MainPage mainPage = new MainPage();
        mainPage.createQuery(city);
        final var currentTemperature = Integer.parseInt(mainPage.getCurrentTemperature());

        assertTrue(-100 <= currentTemperature && currentTemperature <= 100);
    }
}
