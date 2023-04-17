package ru.ifmo.se.tpolab3.pages.news;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.ifmo.se.tpolab3.core.BaseSeleniumPage;
import ru.ifmo.se.tpolab3.pages.apps.components.AppsMenu;
import ru.ifmo.se.tpolab3.pages.common.Menu;

public class NewsPage extends BaseSeleniumPage {

    private final Menu menu = new Menu();
    private final AppsMenu appsMenu = new AppsMenu();
    @FindBy(css = "body > section > div > section > div.desktop-device.desktop-device-chrome.wrap > div:nth-child(1) > div > a")
    private WebElement pcChromeExtensionInstallButton;
    @FindBy(css = "body > section > div > section > div.softmain-list > div:nth-child(3) > div.softmain-subitem.softmain-subitem-browsers > a")
    private WebElement pcChromeExtensionInstallLink;

    public NewsPage() {
        PageFactory.initElements(driver, this);
    }

}

