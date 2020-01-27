package com.Fsdr.selenium.steps.login;

import com.Fsdr.selenium.driverutil.DriverFactory;
import com.Fsdr.selenium.pageobjects.FsdrLoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class fsdrLogin {
  FsdrLoginPage fsdrLoginPage;
  private WebDriver driver;

  @Before
  public void setUp() {
    driver = DriverFactory.getBrowser();
    fsdrLoginPage = new FsdrLoginPage(driver);
  }

  @After(order = 0)
  public void tearDown() {
    driver.quit();
  }

  @Given("I navigate to the login page")
  public void i_navigate_to_the_login_page() {
    fsdrLoginPage.openURL();
  }

  @And("I enter the following Credentials for Login")
  public void i_enter_the_following_Credentials_for_Login() {
    fsdrLoginPage.enterCredentials();
  }

  @Then("I click login button")
  public void i_click_login_button() {
    fsdrLoginPage.submitLogin();
  }

  @Then("I should see the userform page")
  public void i_should_see_the_userform_page() {
    fsdrLoginPage.confirmPageOnUserpage();
  }
}
