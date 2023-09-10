package com.krafttech.tests;

import com.krafttech.TestBase;
import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import com.krafttech.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_06 extends TestBase {

    By lTamam = By.id("android:id/button1");


    @Test
    public void test1() {

        clickWithText("DEVAM");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("Tamam");
        clickWithText("TAMAM");
        clickWithText("API Demos");
        clickWithText("Accessibility");

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }


}
