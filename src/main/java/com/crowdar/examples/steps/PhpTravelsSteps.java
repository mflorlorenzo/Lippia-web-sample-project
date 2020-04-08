package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravelsHomePage;
import com.crowdar.examples.pages.PhpTravelsAboutUsPage;
import com.crowdar.examples.pages.PhpTravelsFlightsListPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PhpTravelsSteps extends PageSteps {

    @Given("The user is in home page")
    public void home() {
        Injector._page(PhpTravelsHomePage.class).go();
    }


    @When("The user goes to about us page")
    public void aboutUs() {
        Injector._page(PhpTravelsHomePage.class).clickAboutUsButton();

    }

    @When("The user search a flight betwteen two days")
    public void searchFlight() {
        Injector._page(PhpTravelsHomePage.class).clickFlightButton();
        Injector._page(PhpTravelsHomePage.class).selectCalendarDate();
        Injector._page(PhpTravelsHomePage.class).clickSearchButton();
    }


    @Then("The about us page is displayed")
    public void statVerfication() {
        Assert.assertTrue(!Injector._page(PhpTravelsAboutUsPage.class).getStats().isEmpty());

    }

    @Then("The search page list the available flights in those days")
    public void flightsListVerfication() {
        Injector._page(PhpTravelsFlightsListPage.class).flightsList();

    }
}
