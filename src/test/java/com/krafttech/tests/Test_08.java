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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test_08 {

    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    By lTamam = By.id("android:id/button1");

    By lScrollView=By.xpath("//*[@text='ScrollView']");
    By lCalFinal=By.id("com.google.android.calculator:id/result_final");


    @Test
    public void test1() {
        driver = Utils.openApp(Device.Pixel_2, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        Utils.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");
        Utils.swipeV(.9,.3);
        Utils.swipeV(.9,.3);
        Utils.swipeV(.2,.8);

        Utils.clickToCoordinate(146,1293);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lScrollView));
        Utils.clickToCoordinate(157,1052);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        Assert.assertEquals(elements.size(), 4);


        driver.closeApp();
        Driver.stopAppiumService();


    }

    @Test
    public void test2() {
        driver = Utils.openApp(Device.Pixel_2, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        Utils.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");
        Utils.swipeV(.9,.3);
        Utils.swipeV(.9,.3);
        Utils.swipeV(.2,.8);

        Utils.clickToCoordinate(146,1293);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lScrollView));
        Utils.clickToCoordinate(157,1052);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        Assert.assertEquals(elements.size(), 4);

        driver = Utils.openApp(Device.Pixel_2, App.Calculator);

        Utils.clickToCoordinate(435,1063);  //8
        Utils.clickToCoordinate(932,1479);  //+
        Utils.clickToCoordinate(665,1056);  //9
        Utils.clickToCoordinate(953,1662);  //=

        String actualText = driver.findElement(lCalFinal).getText();
        Assert.assertEquals(actualText,"17");


        driver.closeApp();
        Driver.stopAppiumService();


    }


}
