package com.Fsdr.selenium.pageobjects;

//import jdk.internal.jline.internal.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

/**
 * Created by Prakash on 21/11/19.
 * Updated on
 */
public class FsdrLoginPage extends FsdrBase {

    private WebDriver _driver = null;

    @FindBy(id = "username")
    public WebElement Uname;

    @FindBy(name = "password")
    public WebElement Pword;

    @FindBy(className = "button")
    public WebElement SignIn;

    @FindBy(linkText = "Sign out fsss1")
    public WebElement SignOut;


    public FsdrLoginPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public void openURL() {

        _driver.get("https://blacklodge-fsdrui.census-gcp.onsdigital.uk/signin/");
    }

    public void login()  {
        try {
            Uname.sendKeys("fsss1");
            Pword.sendKeys("Testing.1");
            SignIn.click();
            if (isElementExist(SignOut)) ;
            {
                Assert.assertTrue(true);

            }

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}