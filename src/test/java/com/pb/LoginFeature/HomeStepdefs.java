package com.pb.LoginFeature;

import com.pb.BaseTest;
import com.pb.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepdefs extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
