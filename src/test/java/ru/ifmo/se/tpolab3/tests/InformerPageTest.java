package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

public class InformerPageTest extends BaseSeleniumTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void selectInformerFromSliderTest(String browser) {
        initDriver(browser);

        var page = new MainPage(driver)
                .menu.goToInformers()
                .slideRight()
                .selectInformerFromSlider(7);

    }
}
