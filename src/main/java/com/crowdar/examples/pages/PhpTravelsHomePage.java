package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String ABOUT_BUTTON = "About Us";
    private final String FLIGHT_BUTTON = "flights";
    private final String CALENDAR_FLIGHT = "FlightsDateStart";
    private final String SEARCH_BUTTON = "Search";
    private final String DAY_PICKER = "datepicker--cell.datepicker--cell-day";

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
        WebElement button = new WebDriverWait(this.getDriver(), 10000).until(ExpectedConditions.elementToBeClickable(By.className(FLIGHT_BUTTON)));
        button.click();
    }

    public void selectCalendarDate() {
        this.getDriver().findElement(By.id(CALENDAR_FLIGHT)).click();
        //this.getDriver().findElement(By.cssSelector(DAY_PICKER)).click();
        this.getDriver().findElement(By.xpath("(//input[@class='datepicker--cell datepicker--cell-day'])[6]"));
        

    }

    public void clickSearchButton() {
        clickElement(By.linkText(SEARCH_BUTTON));
    }

}
