package com.Fsdr.selenium.pageobjects;

import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class FsdrBase {

    /**
     * This method will verify whether an element is present in the UI
     *
     * @param elemetName
     * @return result
     */
    public boolean isElementExist(WebElement elemetName) {

        boolean result = true;
        try {
            elemetName.isDisplayed();
            result = true;

        }
        catch (NoSuchElementException e) {
            result = false;
        }

        return result;
    }

}
