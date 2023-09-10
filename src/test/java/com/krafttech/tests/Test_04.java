package com.krafttech.tests;

import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_04 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;

    Device device = Device.Redmi_8;
    App app = App.ApiDemos;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        Driver.runAppiumService();
        driver = Driver.getDriver(Device.Redmi_8, App.ApiDemos);


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
        Driver.stopAppiumService();

    }

    void clickWithText(String text) {
        driver.findElement(By.xpath("//*[@text='" + text + "']")).click();
    }


}
