package ru.ifmo.se.tpolab3;

import org.junit.jupiter.api.*;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;

import static org.junit.jupiter.api.Assertions.*;


class MainPageTest extends BaseSeleniumTest {
    @Test
    void search() {
        final String city = "Тольятти";

        final MainPage mainPage = new MainPage();
        mainPage.createQuery(city);
        final var currentTemperature = Integer.parseInt(mainPage.getCurrentTemperature());

        assertTrue(-100 <= currentTemperature && currentTemperature <= 100);
    }
}
