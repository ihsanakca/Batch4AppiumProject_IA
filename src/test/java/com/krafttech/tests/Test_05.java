package com.krafttech.tests;


import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.krafttech.utils.MobileUtilities.openApp;


public class Test_05 {

    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    By lOkFirst = By.id("android:id/button1");

    @Test
    public void test1() {

        driver = openApp(Device.Pixel_3, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lOkFirst));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.closeApp();
        Driver.stopAppiumService();

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }
    @Test
    public void test2() {

        driver = openApp(Device.Redmi_8, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        clickWithText("DEVAM");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lOkFirst)).click();
    //    clickWithText("Tamam");
        clickWithText("TAMAM");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.closeApp();
        Driver.stopAppiumService();

    }

}
