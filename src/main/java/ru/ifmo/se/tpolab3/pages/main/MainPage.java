package ru.ifmo.se.tpolab3.pages.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.common.Menu;
import ru.ifmo.se.tpolab3.pages.map.MapPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import static java.lang.Thread.sleep;

public class MainPage extends BaseSeleniumPage {

    public final Menu menu = new Menu();
    @FindBy(css = "body > header > div.header-subnav div.header-container.wrap > div > div.search.js-search > div.search-form.js-search-form > div > input")
    private WebElement searchField;
    @FindBy(css = "body > header > div.header-subnav > div.header-container.wrap > div > div > div.found > div > div.search-list.weather-menu.menu-white > a:nth-child(1)")
    private WebElement relevantSearchResult;
    @FindBy(css = "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c")
    private WebElement currentTemperature;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage createQuery(String cityValue) {
        searchField.click();
        searchField.sendKeys(cityValue);
        wait.until(ExpectedConditions.elementToBeClickable(relevantSearchResult));
        relevantSearchResult.click();

        return this;
    }

    public String getCurrentTemperature() {
        return currentTemperature.getText();
    }
}