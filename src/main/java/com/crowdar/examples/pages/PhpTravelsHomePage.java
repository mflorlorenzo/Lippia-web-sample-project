package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String ABOUT_BUTTON = "About Us";
    private final String FLIGHT_BUTTON = "flights";
    private final String CALENDAR_FLIGHT = "FlightsDateStart";
    private final String SEARCH_BUTTON = "Search";

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

    public void clickFlightButton() {
        clickElement(By.className(FLIGHT_BUTTON));
    }

    public void selectCalendarDate() {
        getElement(By.id(CALENDAR_FLIGHT)).sendKeys('2020-04-20');
    }

    public void clickSearchButton() {
        clickElement(By.linkText(SEARCH_BUTTON));
    }

}
