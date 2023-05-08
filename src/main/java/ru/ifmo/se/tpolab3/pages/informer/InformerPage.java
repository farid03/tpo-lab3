package ru.ifmo.se.tpolab3.pages.informer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.common.Menu;
import ru.ifmo.se.tpolab3.pages.informer.components.InformerMenu;

public class InformerPage extends BaseSeleniumPage {

    public final Menu menu;
    private final InformerMenu informerMenu;
    @FindBy(css = "#ins > div > div.b-j-scroller__nav.b-j-scroller__nav_left > i")
    private WebElement leftSlider;
    @FindBy(css = "#ins > div > div.b-j-scroller__nav.b-j-scroller__nav_right > i")
    private WebElement rightSlider;

    public InformerPage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
        informerMenu = new InformerMenu(driver);
        PageFactory.initElements(driver, this);
    }

    public InformerPage slideLeft() {
        leftSlider.click();
        return this;
    }

    public InformerPage slideRight() {
        rightSlider.click();
        return this;
    }

    public InformerPage selectInformerFromSlider(int numberOfInformer) {
        assert 1 <= numberOfInformer && numberOfInformer <= 15;
        var sliderInformer = new By.ByCssSelector("#ins > div > table > tbody > tr > td:nth-child(" + numberOfInformer + ")");
        var sliderInformerElement = driver.findElement(sliderInformer);
        sliderInformerElement.click();
        return this;
    }

    public InformerPage goToSimpleInformer() {
        informerMenu.simpleInformer.click();
        return this;
    }

    public InformerPage goToConstructor() {
        informerMenu.constructor.click();
        return this;
    }

    public InformerPage goToPolicy() {
        informerMenu.policy.click();
        return this;
    }
}
