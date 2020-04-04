package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsCarsPage extends PageBasePhpTravels {

    public PhpTravelsCarsPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "/cars"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }


}
