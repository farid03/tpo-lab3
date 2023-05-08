package ru.ifmo.se.tpolab3.pages.map.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;

public class ChartPlayer extends BaseSeleniumPage {
    @FindBy(css = "#js-map-player > button.btn-control.btn-pause")
    public WebElement pause;
    @FindBy(css = "#js-map-player > button.btn-control.btn-play")
    public WebElement play;
    @FindBy(css = "#js-map-player > button.btn-control.btn-fw")
    public WebElement fastPlay;
    @FindBy(css = "#js-map-player > button.btn-control.btn-step-forward")
    public WebElement next;
    @FindBy(css = "#js-map-player > button.btn-control.btn-step-back")
    public WebElement previous;

    public ChartPlayer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}