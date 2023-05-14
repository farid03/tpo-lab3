package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InformerPageTest extends BaseSeleniumTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void selectInformerFromSliderTest(final String browser) {
        initDriver(browser);

        final var page = new MainPage(driver)
                .menu.goToInformers()
                .slideRight()
                .selectInformerFromSlider(7);

        assertTrue(page.getCurrentUrl().startsWith(ConfigProvider.INFORMER_PAGE_URL));
    }
}
