package com.Fsdr.selenium.pageobjects;

import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class FsdrBase {

  /**
   * This method will verify whether an element is present in the UI
   *
   * @param webElement
   * @return result
   */
  public boolean isElementExist(WebElement webElement) {
    boolean result;
    try {
      webElement.isDisplayed();
      result = true;
    } catch (NoSuchElementException e) {
      result = false;
    }
    return result;
  }

}
