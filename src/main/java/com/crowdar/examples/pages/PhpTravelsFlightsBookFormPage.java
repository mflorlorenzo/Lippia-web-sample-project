package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PhpTravelsFlightsBookFormPage extends PageBasePhpTravels {

    private final String BOOK_FORM_CONTAINER = "details";
    private final String NAME_FORM = "name";
    private final String SURNAME_FORM = "surname";
    private final String EMAIL_FORM = "email";
    private final String PHONE_FORM = "phone";
    private final String BIRTHDAY_FORM = "birthday";
    private final String CARDNO_FORM = "cardno";
    private final String EXPIRATION_FORM = "expiration";
    private final String CARD_TYPE_FORM = "cardtype";
    private final String CARD_NUMBER_FORM = "card-number";
    private final String EXPIRY_MONTH_FORM = "expiry-month";
    private final String EXPIRY_YEAR_FORM = "expiry-year";
    private final String CARD_CVV_FORM = "cvv";
    private final String CHECKBOX_TERMS = "acceptterm";
    private final String CONFIRM_BUTTON = "confirmBooking";

    public void bookForm() {
    	getWebElement(By.id(BOOK_FORM_CONTAINER));

    }

    public PhpTravelsFlightsBookFormPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void completeBookingForm() {

    }

}
