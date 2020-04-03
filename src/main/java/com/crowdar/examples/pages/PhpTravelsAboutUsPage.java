package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsAboutUsPage extends PageBasePhpTravels {

    private final String ABOUT_TITLE = "hero-slogan";

    private WebElement stats() {
        return getWebElement(By.className(ABOUT_TITLE));
    }

    public PhpTravelsAboutUsPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStats() {
        return stats().getText();
    }

}
