package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapPageTest extends BaseSeleniumTest {

    // прецедент 2
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void basicMapTest(final String browser) {
        initDriver(browser);

        final var mainPage = new MainPage(driver);

        final var mapPage = mainPage
                .menu.goToMaps()
                .selectCloudCoverChartType();

        final var prevWeatherTime = mapPage.getCurrentWeatherTimeHH();

        mapPage.nextPlayChartAnimation();

        assertEquals((prevWeatherTime + 3) % 24, mapPage.getCurrentWeatherTimeHH());
    }

    // прецедент 3
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void animationTest(final String browser) {
        initDriver(browser);

        final var mainPage =
                new MainPage(driver)
                .menu.goToMaps()
                .selectWindChartType()
                .playChartAnimation();

        assertEquals(mainPage.getCurrentUrl(), ConfigProvider.MAPS_WIND_PAGE_URL);
    }
}