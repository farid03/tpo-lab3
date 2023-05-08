package ru.ifmo.se.tpolab3.pages.informer.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;

public class InformerMenu extends BaseSeleniumPage {
    @FindBy(css = "body > section > nav > div > a:nth-child(1)")
    public WebElement simpleInformer;
    @FindBy(css = "body > section > nav > div > a:nth-child(2)")
    public WebElement constructor;
    @FindBy(css = "body > section > nav > div > a:nth-child(3)")
    public WebElement policy;

    public InformerMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
