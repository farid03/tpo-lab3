package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


class MainPageTest extends BaseSeleniumTest {

    // прецедент 1
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void search(final String browser) throws InterruptedException {
        initDriver(browser);

        final String city = "Тольятти";

        final MainPage mainPage = new MainPage(driver);
        mainPage.createQuery(city);
        final var currentTemperature = Integer.parseInt(mainPage.getCurrentTemperature());

        assertTrue(-100 <= currentTemperature && currentTemperature <= 100);
    }
}
