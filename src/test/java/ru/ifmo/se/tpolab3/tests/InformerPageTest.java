package ru.ifmo.se.tpolab3.tests;

import org.junit.jupiter.api.Test;
import ru.ifmo.se.tpolab3.core.BaseSeleniumTest;
import ru.ifmo.se.tpolab3.pages.main.MainPage;

public class InformerPageTest extends BaseSeleniumTest {

    @Test
    void selectInformerFromSliderTest() {
        var page = new MainPage()
                .menu.goToInformers()
                .slideRight()
                .selectInformerFromSlider(7);

    }
}
