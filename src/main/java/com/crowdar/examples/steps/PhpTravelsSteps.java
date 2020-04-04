package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravelsHomePage;
import com.crowdar.examples.pages.PhpTravelsAboutUsPage;
import com.crowdar.examples.pages.PhpTravelsCarsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PhpTravelsSteps extends PageSteps {

    @Given("The user is in home page")
    public void home() {
        Injector._page(PhpTravelsHomePage.class).go();
    }

    @Given("The user is in cars page")
    public void cars() {
        Injector._page(PhpTravelsCarsPage.class).go();

    }

    @When("The user goes to about us page")
    public void aboutUs() {
        Injector._page(PhpTravelsHomePage.class).clickAboutUsButton();

    }

    @Then("The about us page is displayed")
    public void statVerfication() {
        Assert.assertTrue(!Injector._page(PhpTravelsAboutUsPage.class).getStats().isEmpty());

    }
}
