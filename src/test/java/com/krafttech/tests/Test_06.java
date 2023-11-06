package com.krafttech.tests;

import com.krafttech.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_06 extends TestBase {

    By lTamam = By.id("android:id/button1");


    @Test
    public void test1() {

        clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }


}
