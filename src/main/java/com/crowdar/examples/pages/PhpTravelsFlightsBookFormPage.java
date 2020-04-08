package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;     


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

    private void passengerInfo() {
    	// Con esto evito el error de que algo se superpone sobre los campos a llenar
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500);");

    	completeField(By.id(NAME_FORM), "Automation");
    	completeField(By.id(SURNAME_FORM), "Test");
    	completeField(By.id(EMAIL_FORM), "automation@test.com");
    	completeField(By.id(PHONE_FORM), "123456");
    	completeField(By.id(BIRTHDAY_FORM), "1990-01-01");
    	completeField(By.id(CARDNO_FORM), "1233456");
    	completeField(By.id(EXPIRATION_FORM), "2030-01-01");
    }

    private void paymentInfo () {
    	// Con esto evito el error de que algo se superpone sobre los campos a llenar
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1200);");

    	new Select (driver.findElement(By.id(CARD_TYPE_FORM))).selectByVisibleText("Visa");
    	completeField(By.id(CARD_NUMBER_FORM), "4263982640269299");
    	new Select (driver.findElement(By.id(EXPIRY_MONTH_FORM))).selectByVisibleText("Feb (02)");
    	new Select (driver.findElement(By.id(EXPIRY_YEAR_FORM))).selectByVisibleText("2023");
    	completeField(By.id(CARD_CVV_FORM), "837");
    }

    public PhpTravelsFlightsBookFormPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void bookForm() {
    	getWebElement(By.id(BOOK_FORM_CONTAINER));
    }

    public void checkBoxTerms() {
    	clickElement(By.id(CHECKBOX_TERMS));
    }


    public void completeBookingForm() {
    	passengerInfo();
    	paymentInfo();
    	//checkBoxTerms();
    }

    public void submitBooking() {
        clickElement(By.id(CONFIRM_BUTTON));    	
    }

}
