package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsFlightPage extends PageBasePhpTravels {

    // private final String CONTAINER_FLIGHTS = "List";

    // private WebElement stats() {
    //     return getWebElement(By.className(CONTAINER_FLIGHTS));
    // }

    public PhpTravelsFlightPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    // public String getStats() {
    //     return stats();
    // }

}
