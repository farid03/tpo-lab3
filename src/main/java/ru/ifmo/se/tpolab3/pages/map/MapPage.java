package ru.ifmo.se.tpolab3.pages.map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.common.Menu;
import ru.ifmo.se.tpolab3.pages.map.components.ChartMenu;
import ru.ifmo.se.tpolab3.pages.map.components.ChartPlayer;

public class MapPage extends BaseSeleniumPage {
    public final Menu menu;
    private final ChartMenu chartMenu;
    private final ChartPlayer chartPlayer;
    @FindBy(css = "body > section > div > section > div.maps-main > div.right-side > div > div.date-time-list-item.is-active > div.time")
    private WebElement currentWeatherDateTime;

    public MapPage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
        chartMenu = new ChartMenu(driver);
        chartPlayer = new ChartPlayer(driver);
        PageFactory.initElements(driver, this);
    }

    public int getCurrentWeatherTimeHH() {
        var timeHH = Integer.parseInt(currentWeatherDateTime.getText().split(":")[0]);

        return timeHH;
    }

    public MapPage selectRainfallChartType() {
        chartMenu.rainfall.click();
        return this;
    }

    public MapPage selectTemperatureChartType() {
        chartMenu.temperature.click();
        return this;
    }

    public MapPage selectWindChartType() {
        chartMenu.wind.click();
        return this;
    }

    public MapPage selectCloudCoverChartType() {
        chartMenu.cloudCover.click();
        return this;
    }

    public MapPage selectAllergyChartType() {
        chartMenu.allergy.click();
        return this;
    }

    public MapPage playChartAnimation() {
        chartPlayer.play.click();
        return this;
    }

    public MapPage pauseChartAnimation() {
        chartPlayer.pause.click();
        return this;
    }

    public MapPage fastPlayChartAnimation() {
        chartPlayer.fastPlay.click();
        return this;
    }

    public MapPage nextPlayChartAnimation() {
        chartPlayer.next.click();
        return this;
    }

    public MapPage previousPlayChartAnimation() {
        chartPlayer.previous.click();
        return this;
    }
}