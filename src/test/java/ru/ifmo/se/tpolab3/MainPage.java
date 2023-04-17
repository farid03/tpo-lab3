package ru.ifmo.se.tpolab3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.properties.reader.ConfigProvider;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div[1]/div[2]/div/input")
    private WebElement searchField;
    @FindBy(xpath = "/html/body/section[2]/div[1]/section[2]/div/a[1]/div/div[1]/div[3]/div[1]/span[1]")
    private WebElement currentTemperature;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage createQuery(String cityValue) {
        searchField.click();
        searchField.sendKeys(cityValue, Keys.ENTER);

        return this;
    }

    public String getCurrentTemperature() {
        return currentTemperature.getText();
    }
}