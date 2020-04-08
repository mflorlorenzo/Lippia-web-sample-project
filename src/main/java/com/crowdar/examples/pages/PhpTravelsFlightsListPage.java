package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PhpTravelsFlightsListPage extends PageBasePhpTravels {

    private final String FLIGHTS_CONTAINER = "LIST";
    private final String BOOK_BUTTON = "//form/div[2]/div/button";
    private final String BOOK_FORM_CONTAINER = "details";


    public void flightsList() {
        getWebElement(By.id(FLIGHTS_CONTAINER));
    }

    public PhpTravelsFlightsListPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void selectFlight() {
        //clickElement(By.xpath(BOOK_BUTTON));
        WebElement button = new WebDriverWait(this.getDriver(), 10000).until(ExpectedConditions.elementToBeClickable(By.xpath(BOOK_BUTTON)));
        button.click();
    }


}
