package com.Fsdr.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Prakash on 21/11/19.
 * Updated on
 */
public class SearchResultsPage extends FsdrBase {

  @FindBy(id = "user")
  public WebElement username;

  @FindBy(name = "password")
  public WebElement password;

  @FindBy(xpath = "/html/body/div/div/form/div/div/div/main/button")
  public WebElement SignIn;

  @FindBy(linkText = "Sign out fsss1")
  public WebElement SignOut;

  @FindBy(partialLinkText = "Search")
  public WebElement Search;

  @FindBy(className = "light-table-filter")
  public WebElement filter;

  @FindBy(name = "firstname")
  public WebElement firstname;

  @FindBy(name = "filter_surname")
  public WebElement surname;

  @FindBy(name = "jobroleid")
  public WebElement jobRoleId;

  @FindBy(name = "areacode")
  public WebElement AreaCode;

  @FindBy(name = "idbadgenumber")
  public WebElement BadgeNumber;

  @FindBy(name = "jobRole")
  public WebElement JobRole;

  @FindBy(name = "action[submit]")
  public WebElement Submit;

  @FindBy(linkText = "View Field Worker")
  public WebElement ViewFieldWorker;

  private WebDriver webDriver;

  public SearchResultsPage(WebDriver driver) {
    this.webDriver = driver;
    PageFactory.initElements(webDriver, this);
  }

  public void signIn() {
    webDriver.get("http://localhost:9293/signin");
    username.sendKeys("fsss1");
    password.sendKeys("Testing.1");
    SignIn.click();
  }

  public void confirmPageOnUserpage() {
    String currentUrl = webDriver.getCurrentUrl();
    assertEquals("http://localhost:9293/index+1", currentUrl);
  }

  public void searchForFieldWorker() {
    surname.sendKeys("Enriquez");
    Submit.click();
  }

  public void confirmResults() {
    WebElement name = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/div/div[1]/table/tbody/tr[1]/td"));
    WebElement email = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/div/div[1]/table/tbody/tr[3]/td"));

    assertEquals("Dougie Enriquez", name.getText());
    assertEquals("Dougie.Enriquez@ons.gov.uk", email.getText());
  }

  public void clickFieldWorker() {
    ViewFieldWorker.click();
  }
}
