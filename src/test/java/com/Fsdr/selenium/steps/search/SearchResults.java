package com.Fsdr.selenium.steps.search;

import com.Fsdr.selenium.driverutil.DriverFactory;
import com.Fsdr.selenium.pageobjects.SearchResultsPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SearchResults {

  private WebDriver driver;
  SearchResultsPage searchResultsPage;

  @Before
  public void setUp() {
    driver = DriverFactory.getBrowser();
    searchResultsPage = new SearchResultsPage(driver);
    searchResultsPage.signIn();
  }

  @After(order=0)
  public void tearDown(){
    driver.quit();
  }

  @Given("fsdr user is logged in")
  public void fsdrUserIsLoggedIn() {
    searchResultsPage.confirmPageOnUserpage();
  }

  @And("searches for a field worker")
  public void searchesForAFieldWorker() {
    searchResultsPage.searchForFieldWorker();
  }

  @Then("field worker results will be displayed")
  public void fieldWorkerResultsWillBeDisplayed() {
    searchResultsPage.clickFieldWorker();
  }

  @And("a field worker can then be viewed")
  public void aFieldWorkerCanThenBeViewed() throws InterruptedException {
    searchResultsPage.confirmResults();
  }
}
