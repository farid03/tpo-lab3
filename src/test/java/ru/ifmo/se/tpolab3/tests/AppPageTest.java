package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppPageTest extends BaseSeleniumTest {
    // прецедент 10
    @Test
    void extensionInstallTest() throws InterruptedException {
        var page = new MainPage()
                .menu.goToApps()
                .installExtension();

        var wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState")
                        .equals("complete")
                );

        assertEquals(driver.getCurrentUrl(), ConfigProvider.EXTENSION_URL);
    }
}
