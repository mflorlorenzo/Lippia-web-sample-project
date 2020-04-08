package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsFlightsListPage extends PageBasePhpTravels {

    private final String FLIGHTS_CONTAINER = "LIST";

    public void flightsList() {
        getWebElement(By.id(FLIGHTS_CONTAINER));
    }

    public PhpTravelsFlightsListPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

}
