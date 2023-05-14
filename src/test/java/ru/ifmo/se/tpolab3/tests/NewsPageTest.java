package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsPageTest extends BaseSeleniumTest {
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void basicNewsPageTest(String browser) {
        initDriver(browser);

        final var mainPage = new MainPage(driver);

        var newsPage = mainPage.menu
                .goToNews();

        var wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState")
                .equals("complete")
        );

        assertEquals(newsPage.getCurrentUrl(), ConfigProvider.NEWS_PAGE_URL);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void basicMainNewsArticleTest(String browser) {
        initDriver(browser);

        final var mainPage = new MainPage(driver);

        var newsPage = mainPage.menu
                .goToNews();
    }
}
