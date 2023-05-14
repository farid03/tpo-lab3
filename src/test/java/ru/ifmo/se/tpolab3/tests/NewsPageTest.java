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

class NewsPageTest extends BaseSeleniumTest {
    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void basicNewsPageTest(final String browser) {
        initDriver(browser);

        final var mainPage = new MainPage(driver);

        final var newsPage = mainPage.menu
                .goToNews();

        final var wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver ->
                "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState"))
        );

        assertEquals(newsPage.getCurrentUrl(), ConfigProvider.NEWS_PAGE_URL);
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void basicMainNewsArticleTest(final String browser) {
        initDriver(browser);

        final var mainPage = new MainPage(driver);

        final var newsPage = mainPage.menu
                .goToNews()
                .clickMainNewsArticle();

        assertEquals(newsPage.getCurrentUrl(), ConfigProvider.TEST_MAIN_NEWS_PAGE_URL);
    }
}
