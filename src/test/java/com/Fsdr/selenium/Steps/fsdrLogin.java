package com.Fsdr.selenium.Steps;

import com.Fsdr.selenium.driverutil.DriverFactory;
import com.Fsdr.selenium.pageobjects.FsdrLoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class fsdrLogin {
    private WebDriver driver;
    FsdrLoginPage fsdrLoginPage;
    //SearchResultsPage searchResultsPage;

    @Before
    public void setUp() throws Exception {
        driver = DriverFactory.getBrowser();
        fsdrLoginPage = new FsdrLoginPage(driver);
       // searchResultsPage = new SearchResultsPage(driver);
    }

    @After(order=0)
    public void tearDown(){
        driver.quit();
    }


    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {


        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @And("I enter the following Credentials for Login")
    public void i_enter_the_following_Credentials_for_Login() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

    @Then("I click login button")
    public void i_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

}
