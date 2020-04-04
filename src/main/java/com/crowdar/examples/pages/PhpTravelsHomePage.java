package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String ABOUT_BUTTON = "About Us";
    private final String CARS_BUTTON = "Cars";

    public PhpTravelsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clickAboutUsButton() {
        clickElement(By.linkText(ABOUT_BUTTON));
    }

    public void clickCarsButton() {
        clickElement(By.linkText(CARS_BUTTON));
    }

}
