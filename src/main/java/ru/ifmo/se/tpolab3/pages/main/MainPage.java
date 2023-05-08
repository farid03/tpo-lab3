package ru.ifmo.se.tpolab3.pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.common.Menu;
import ru.ifmo.se.tpolab3.pages.map.MapPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MainPage extends BaseSeleniumPage {

    public final Menu menu = new Menu();
    @FindBy(css = "body > header > div.header-subnav > div.header-container.wrap > div > div.search.js-search > div.search-form.js-search-form > div > input")
    private WebElement searchField;
    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div/div[2]/div/div[2]/a")
    private WebElement relevantSearchResult;
    @FindBy(css = "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c")
    private WebElement currentTemperature;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage createQuery(String cityValue) throws InterruptedException {
        searchField.click();
        searchField.sendKeys(cityValue);
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(relevantSearchResult));
        relevantSearchResult.click();

        return this;
    }

    public String getCurrentTemperature() {
        return currentTemperature.getText();
    }
}