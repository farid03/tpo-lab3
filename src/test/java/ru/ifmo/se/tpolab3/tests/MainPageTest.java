package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.*;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

import static org.junit.jupiter.api.Assertions.*;


class MainPageTest extends BaseSeleniumTest {

    // прецедент 1
    @Test
    void search() {
        final String city = "Тольятти";

        final MainPage mainPage = new MainPage();
        mainPage.createQuery(city);
        final var currentTemperature = Integer.parseInt(mainPage.getCurrentTemperature());

        assertTrue(-100 <= currentTemperature && currentTemperature <= 100);
    }
}
