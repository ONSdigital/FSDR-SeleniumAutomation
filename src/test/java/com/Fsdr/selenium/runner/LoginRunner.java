package com.Fsdr.selenium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:src/test/resources/files/cucumber-report.html"},
    features = {"src/test/resources/features"},
    glue = {"com.Fsdr.selenium/steps.login"})

public class LoginRunner {
}

