package com.Fsdr.selenium.driverutil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jaya prakash  on 21/11/19.
 */
public class DriverFactory {

  public static WebDriver getBrowser() {

    WebDriver webDriver;
    String browser = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
    DriverType driverType = DriverType.valueOf(browser);

    switch (driverType) {
    case FIREFOX:
      WebDriverManager.firefoxdriver().setup();
      webDriver = new FirefoxDriver();
      break;
    case EDGE:
      WebDriverManager.edgedriver().setup();
      webDriver = new EdgeDriver();
      break;
    case IE:
      WebDriverManager.iedriver().setup();
      webDriver = new InternetExplorerDriver();
      break;
    case OPERA:
      WebDriverManager.operadriver().setup();
      webDriver = new OperaDriver();
      break;
    case CHROME:
    default:
      WebDriverManager.chromedriver().setup();
      webDriver = new ChromeDriver();
      break;
    }
    webDriver.manage().window().maximize();
    webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    return webDriver;
  }
}
