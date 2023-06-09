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


class AppPageTest extends BaseSeleniumTest {
    // прецедент 10

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void extensionInstallTest(final String browser) throws InterruptedException {
        initDriver(browser);

//        var page =
                new MainPage(driver)
                .menu.goToApps()
                .installExtension();

        final var wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver ->
                "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState"))
        );

        assertEquals(driver.getCurrentUrl(), ConfigProvider.BROWSER_EXTENSION_URL);
    }
}
