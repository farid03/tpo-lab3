package ru.ifmo.se.tpolab3.pages.map.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;

public class ChartMenu extends BaseSeleniumPage {
    @FindBy(css = "a.header-subnav-link:nth-child(3)")
    public WebElement rainfall;
    @FindBy(css = "a.header-subnav-link:nth-child(4)")
    public WebElement temperature;
    @FindBy(css = "a.header-subnav-link:nth-child(5)")
    public WebElement wind;
    @FindBy(css = "a.header-subnav-link:nth-child(6)")
    public WebElement cloudCover;
    @FindBy(css = "a.header-subnav-link:nth-child(7)")
    public WebElement allergy;

    public ChartMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}