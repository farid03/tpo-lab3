package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.Test;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MapPageTest extends BaseSeleniumTest {

    // прецедент 2
    @Test
    void basicMapTest() {
        final var mainPage = new MainPage();

        var mapPage = mainPage
                .menu.goToMaps()
                .selectCloudCoverChartType();

        var prevWeatherTime = mapPage.getCurrentWeatherTimeHH();

        mapPage.nextPlayChartAnimation();

        assertEquals(prevWeatherTime + 3 % 24, mapPage.getCurrentWeatherTimeHH());
    }

    // прецедент 3
    @Test
    void animationTest() throws InterruptedException {
        final var mainPage = new MainPage()
                .menu.goToMaps()
                .selectWindChartType()
                .playChartAnimation();

        sleep(2000);
    }


}