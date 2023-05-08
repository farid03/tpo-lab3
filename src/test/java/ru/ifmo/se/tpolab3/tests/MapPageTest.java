package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MapPageTest extends BaseSeleniumTest {

    // прецедент 2
    @ParameterizedTest
    @ValueSource(classes = { ChromeDriver.class, FirefoxDriver.class })
    void basicMapTest(Class<? extends WebDriver> webDriverClass) {
        setUpDriver(webDriverClass);

        final var mainPage = new MainPage();

        var mapPage = mainPage
                .menu.goToMaps()
                .selectCloudCoverChartType();

        var prevWeatherTime = mapPage.getCurrentWeatherTimeHH();

        mapPage.nextPlayChartAnimation();

        assertEquals(prevWeatherTime + 3 % 24, mapPage.getCurrentWeatherTimeHH());
    }

    // прецедент 3
    @ParameterizedTest
    @ValueSource(classes = { ChromeDriver.class, FirefoxDriver.class })
    void animationTest(Class<? extends WebDriver> webDriverClass) throws InterruptedException {
        setUpDriver(webDriverClass);

        final var mainPage = new MainPage()
                .menu.goToMaps()
                .selectWindChartType()
                .playChartAnimation();

        sleep(2000);
    }


}