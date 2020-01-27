package com.Fsdr.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Prakash on 21/11/19.
 * Updated on
 */
public class FsdrLoginPage extends FsdrBase {

  @FindBy(id = "user")
  public WebElement username;

  @FindBy(name = "password")
  public WebElement password;

  @FindBy(xpath = "/html/body/div/div/form/div/div/div/main/button")
  public WebElement SignIn;

  private WebDriver webDriver;

  public FsdrLoginPage(WebDriver webDriver) {
    this.webDriver = webDriver;
    PageFactory.initElements(this.webDriver, this);
  }

  public void openURL() {
    webDriver.get("http://localhost:9293/signin");
    String title = webDriver.getTitle();
    assertEquals("FSDR", title);
  }

  public void enterCredentials() {
    username.sendKeys("fsss1");
    password.sendKeys("Testing.1");
  }

  public void submitLogin() {
    SignIn.click();
  }

  public void confirmPageOnUserpage() {
    WebElement element = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/h1"));
    assertEquals("Field Force view for: fsss", element.getText());
  }
}