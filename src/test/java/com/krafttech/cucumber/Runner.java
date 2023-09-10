package com.krafttech.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/krafttech/cucumber/calculator.feature",
        glue = "com/krafttech/cucumber"
)


public class Runner extends AbstractTestNGCucumberTests {
}
