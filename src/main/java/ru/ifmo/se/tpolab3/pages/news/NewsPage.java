package ru.ifmo.se.tpolab3.pages.news;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.common.Menu;

public class NewsPage extends BaseSeleniumPage {

    private final Menu menu;
    @FindBy(css = "div.card-wrap:nth-child(1)")
    private WebElement mainNewsArticle;

    public NewsPage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
        PageFactory.initElements(driver, this);
    }

    public NewsPage clickMainNewsArticle() {
        wait.until(ExpectedConditions.elementToBeClickable(mainNewsArticle));
        mainNewsArticle.click();
        return this;
    }
}

