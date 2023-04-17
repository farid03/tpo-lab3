package ru.ifmo.se.tpolab3.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.apps.AppsPage;
import ru.ifmo.se.tpolab3.pages.informer.InformerPage;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.pages.map.MapPage;

public class Menu extends BaseSeleniumPage {

    @FindBy(css = "body > header > div.header-white > div > div > div.top-middle > div > a:nth-child(1)")
    protected WebElement weather;
    @FindBy(css = "body > header > div.header-white > div > div > div.top-middle > div > a:nth-child(2)")
    protected WebElement news;
    @FindBy(css = "body > header > div.header-white > div > div > div.top-middle > div > a:nth-child(3)")
    protected WebElement maps;
    @FindBy(css = "body > header > div.header-white > div > div > div.top-middle > div > a:nth-child(4)")
    protected WebElement informers;
    @FindBy(css = "body > header > div.header-white > div > div > div.top-middle > div > a:nth-child(5)")
    protected WebElement apps;

    public Menu() {
        PageFactory.initElements(driver, this);
    }

    public MainPage goToWeather() {
        this.weather.click();
        return new MainPage();
    }
    public MapPage goToNews() { // TODO
        this.news.click();
        return new MapPage();
    }
    public MapPage goToMaps() {
        this.maps.click();
        return new MapPage();
    }
    public InformerPage goToInformers() {
        this.informers.click();
        return new InformerPage();
    }
    public AppsPage goToApps() {
        this.apps.click();
        return new AppsPage();
    }

}
