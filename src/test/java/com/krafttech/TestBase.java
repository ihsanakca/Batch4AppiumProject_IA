package com.krafttech;




import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import com.krafttech.utils.MobileUtilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

public class TestBase {
   protected AppiumDriver<MobileElement> driver;
  protected   WebDriverWait wait;
    @BeforeTest
    public void beforeTest(){
        driver = MobileUtilities.openApp(Device.Pixel_3, App.ApiDemos);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @AfterTest
    public void afterTest(){
        driver.closeApp();
        Driver.stopAppiumService();
    }
}
