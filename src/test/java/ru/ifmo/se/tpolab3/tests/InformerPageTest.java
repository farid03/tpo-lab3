package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

public class InformerPageTest extends BaseSeleniumTest {

    @ParameterizedTest
    @ValueSource(classes = { ChromeDriver.class, FirefoxDriver.class })
    void selectInformerFromSliderTest(Class<? extends WebDriver> webDriverClass) {
        setUpDriver(webDriverClass);

        var page = new MainPage()
                .menu.goToInformers()
                .slideRight()
                .selectInformerFromSlider(7);

    }
}
