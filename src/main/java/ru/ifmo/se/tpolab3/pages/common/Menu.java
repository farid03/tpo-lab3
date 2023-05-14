package ru.ifmo.se.tpolab3.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.apps.AppsPage;
import ru.ifmo.se.tpolab3.pages.informer.InformerPage;
import ru.ifmo.se.tpolab3.pages.main.MainPage;
import ru.ifmo.se.tpolab3.pages.map.MapPage;
import ru.ifmo.se.tpolab3.pages.news.NewsPage;

public class Menu extends BaseSeleniumPage {

    @FindBy(css = ".js-menu-link-weather")
    protected WebElement weather;
    @FindBy(css = ".js-menu-link-news")
    protected WebElement news;
    @FindBy(css = ".js-menu-link-maps")
    protected WebElement maps;
    @FindBy(css = ".js-menu-link-informers")
    protected WebElement informers;
    @FindBy(css = ".js-menu-link-soft")
    protected WebElement apps;

    public Menu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage goToWeather() {
        this.weather.click();
        return new MainPage(driver);
    }

    public NewsPage goToNews() {
        this.news.click();
        return new NewsPage(driver);
    }

    public MapPage goToMaps() {
//        this.maps.click();
        driver.get("https://www.gismeteo.ru/maps/");
        return new MapPage(driver);
    }

    public InformerPage goToInformers() {
//        this.informers.click();
        driver.get("https://www.gismeteo.ru/informers/");
        return new InformerPage(driver);
    }

    public AppsPage goToApps() {
//        this.apps.click();
        driver.get("https://www.gismeteo.ru/soft/");
        return new AppsPage(driver);
    }

}
