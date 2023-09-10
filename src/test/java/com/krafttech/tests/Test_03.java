package com.krafttech.tests;

import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_03 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;

    Device device = Device.Redmi_8;
    App app = App.ApiDemos;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                // .usingPort(4723)
                .usingAnyFreePort()
                .build();
        service.clearOutPutStreams();
        service.start();


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:udid", device.udid);
        capabilities.setCapability("appium:version", device.version);
        capabilities.setCapability("appium:deviceName", device.deviceName);
        capabilities.setCapability("platformName", device.platformName);

        // com.touchboarder.android.api.demos/com.touchboarder.androidapidemos.MainActivity

        capabilities.setCapability("appium:appPackage", app.appPackage);
        capabilities.setCapability("appium:appActivity", app.appActivity);

        //driver'ı  ayarlayalım


        driver = new AndroidDriver<>(service.getUrl(), capabilities);

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
        service.stop();

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }


}
