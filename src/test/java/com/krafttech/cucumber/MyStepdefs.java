package com.krafttech.cucumber;



import com.krafttech.utils.Driver;
import com.krafttech.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class MyStepdefs {
    AppiumDriver<MobileElement> driver= Driver.getDriver();

    @Given("The user is on the start page")
    public void theUserIsOnTheStartPage() {

        driver.resetApp();
    }

    @When("The user sum of following numbers")
    public void theUserSumOfFollowingNumbers(List<Integer> numbers) {
        int size=numbers.size();
        int max=1;

        for (Integer number : numbers) {
            Utils.clickNumbers(number);
            if(max!=size){
                Utils.operators("artı");
            }
            max++;
        }
//        Utils.clickNumber(numbers.get(0));
//        Utils.operators("artı");
//        Utils.clickNumber(numbers.get(1));
//        Utils.operators("artı");
//        Utils.clickNumber(numbers.get(2));

       Utils.operators("eşittir");
    }

    @Then("The result should be {int}")
    public void theResultShouldBe(int result) {
        String actualNumber = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
        Assert.assertEquals(Integer.parseInt(actualNumber),result);
        driver.closeApp();
    }
}
