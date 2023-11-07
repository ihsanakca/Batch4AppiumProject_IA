package com.krafttech.tests;


import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.krafttech.utils.MobileUtilities;
import java.util.List;

public class Test_08 {

    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    By lTamam = By.id("android:id/button1");

    By lScrollView=By.xpath("//*[@text='ScrollView']");
    By lCalFinal=By.id("com.google.android.calculator:id/result_final");


    @Test
    public void test1() {
        driver = MobileUtilities.openApp(Device.Pixel_3, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        MobileUtilities.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("API Demos");
        MobileUtilities.clickWithText("Accessibility");
        driver.navigate().back();
        MobileUtilities.clickWithText("Views");
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.2,.8);

        MobileUtilities.clickToCoordinate(146,1293);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lScrollView));
        MobileUtilities.clickToCoordinate(157,1052);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        Assert.assertEquals(elements.size(), 4);


        driver.closeApp();
        Driver.stopAppiumService();


    }

    @Test
    public void test2() {
        driver = MobileUtilities.openApp(Device.Pixel_3, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        MobileUtilities.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("API Demos");
        MobileUtilities.clickWithText("Accessibility");
        driver.navigate().back();
        MobileUtilities.clickWithText("Views");
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.2,.8);

        MobileUtilities.clickToCoordinate(146,1293);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lScrollView));
        MobileUtilities.clickToCoordinate(157,1052);

        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        Assert.assertEquals(elements.size(), 4);

        driver = MobileUtilities.openApp(Device.Pixel_3, App.Calculator);

        MobileUtilities.clickToCoordinate(415,1216);  //8
        MobileUtilities.clickToCoordinate(925,1664);  //+
        MobileUtilities.clickToCoordinate(658,1167);  //9
        MobileUtilities.clickToCoordinate(953,1886);  //=

        String actualText = driver.findElement(lCalFinal).getText();
        Assert.assertEquals(actualText,"17");


        driver.closeApp();
        Driver.stopAppiumService();


    }

    @Test
    public void test3() throws InterruptedException {
        driver = MobileUtilities.openApp(Device.Pixel_3, App.ApiDemos);

        wait = new WebDriverWait(driver, 10);

        MobileUtilities.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("OK");
        MobileUtilities.clickWithText("API Demos");
        MobileUtilities.clickWithText("Accessibility");
        driver.navigate().back();
        MobileUtilities.clickWithText("Views");
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.9,.3);
        MobileUtilities.swipeV(.2,.8);

        MobileUtilities.clickToCoordinate(146,1293);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lScrollView));
        MobileUtilities.clickToCoordinate(157,1052);



        driver = MobileUtilities.openApp(Device.Pixel_3, App.Calculator);

        MobileUtilities.clickToCoordinate(415,1216);  //8
        MobileUtilities.clickToCoordinate(925,1664);  //+
        MobileUtilities.clickToCoordinate(658,1167);  //9
        MobileUtilities.clickToCoordinate(953,1886);  //=

        String actualText = driver.findElement(lCalFinal).getText();
        Assert.assertEquals(actualText,"17");

        int expectedSize= (Integer.parseInt(actualText)-1)/4;
        System.out.println("expectedSize = " + expectedSize);

        MobileUtilities.activateBackgroundApp(App.ApiDemos.appPackage);

        Thread.sleep(2000);
        List<MobileElement> elements = driver.findElements(By.className("android.widget.TextView"));

        Assert.assertEquals(elements.size(), 4);


        driver.closeApp();
        Driver.stopAppiumService();


    }


}
