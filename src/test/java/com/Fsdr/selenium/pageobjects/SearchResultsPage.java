package com.Fsdr.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Prakash on 21/11/19.
 * Updated on
 */
public class SearchResultsPage {

    private WebDriver _driver = null;

    @FindBy(partialLinkText = "Search")
    public WebElement Search;

    @FindBy(className = "light-table-filter")
    public WebElement filter;

    @FindBy(name = "firstname")
    public WebElement FName;

    @FindBy(name = "surname")
    public WebElement SName;

    @FindBy(name = "jobroleid")
    public WebElement JBid;

    @FindBy(name = "areacode")
    public WebElement AreaCode;

    @FindBy(name = "idbadgenumber")
    public WebElement BadgeNumber;

    @FindBy(name = "jobRole")
    public WebElement JobRole;

    @FindBy(name = "submit")
    public WebElement Submit;


    @FindBy(linkText ="View Field Worker")
    public WebElement ViewFieldWorker;

    public SearchResultsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }
 public void Search() throws InterruptedException {

        Search.click();
        FName.sendKeys("Jessa");
        SName.sendKeys("Rowan");
        JBid.sendKeys("LND2");
        //AreaCode.sendKeys("City of London");
       // BadgeNumber.sendKeys("1000011595");
        JobRole.sendKeys("Area Manager");
        Submit.click();
        ViewFieldWorker.click();
        Thread.sleep(1000);


 }


}
