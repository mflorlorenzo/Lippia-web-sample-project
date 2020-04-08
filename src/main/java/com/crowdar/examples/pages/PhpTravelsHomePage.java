package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.JavascriptExecutor;      

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String ABOUT_BUTTON = "About Us";
    private final String FLIGHT_BUTTON = "flights";
    private final String CALENDAR_FLIGHT = "FlightsDateStart";
    private final String SEARCH_BUTTON = "//form/div/div[3]/div[4]/button";

    private String afterTomorrowDate() {
        Date today = new Date();               
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd");            
        Calendar c = Calendar.getInstance();        
        c.add(Calendar.DATE, 2);     
        String afterTomorrow = (String)(formattedDate.format(c.getTime()));
        return afterTomorrow;
    }

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
        //WebElement calendario = this.getDriver().findElement(By.id(CALENDAR_FLIGHT));

        //Modificarlo para que tome el id de CALENDAR_FLIGHT y le fecha de afterTomorrowDate
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('FlightsDateStart').value='2020-04-10';");

    }

    public void clickSearchButton() {
        //Buscar el button por class o linkText no funciona ya que hay otros elementos arriba
        WebElement button = new WebDriverWait(this.getDriver(), 10000).until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON)));
        button.click();
    }

}
