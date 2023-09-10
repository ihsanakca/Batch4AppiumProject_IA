package com.krafttech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_01 {

    /**
     * {
     * "appium:udid": "3c7eb8",
     * "appium:version": "12",
     * "appium:deviceName": "XiaomiNote8",
     * "platformName": "Android",
     * "appium:realDevice": "false",
     * "appium:automationName": "uiautomator2",
     * "appium:disableIdLocatorAutocompletion": "true"
     * }
     */
    AppiumDriver<MobileElement> driver;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:udid", "3c7eb8");
        capabilities.setCapability("appium:version", "12");
        capabilities.setCapability("appium:deviceName", "XiaomiNote8");
        capabilities.setCapability("platformName", "Android");

        // com.touchboarder.android.api.demos/com.touchboarder.androidapidemos.MainActivity

        capabilities.setCapability("appium:appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity", "com.touchboarder.androidapidemos.MainActivity");

        //driver'ı  ayarlayalım


        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

//      driver.findElement(By.xpath("//*[@text='DEVAM']")).click();
        clickWithText("DEVAM");
//      driver.findElement(By.xpath("//*[@text='Tamam']")).click();
        Thread.sleep(3000);
        clickWithText("Tamam");
        clickWithText("TAMAM");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        Thread.sleep(2000);
        driver.closeApp();

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }


}
