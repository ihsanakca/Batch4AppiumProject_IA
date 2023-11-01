package com.krafttech.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.krafttech.utils.Driver.*;

public class Utils {

//    static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> openApp(Device device, App app) {
        runAppiumService();
        return getDriver(device, app);
    }

    public static void clickWithText(String text) {
//        driver = Driver.getDriver();
        Driver.getDriver().findElement(By.xpath("//*[@text='" + text + "']")).click();
    }

    public static void swipeV(double startPoint, double endPoint) {
      //  driver = Driver.getDriver();
        int width = Driver.getDriver().manage().window().getSize().width;
        int height = Driver.getDriver().manage().window().getSize().height;

        new TouchAction<>(Driver.getDriver())
                .press(PointOption.point(width / 2, (int) (height * startPoint)))
                .moveTo(PointOption.point(width / 2, (int) (height * endPoint)))
                .release()
                .perform();
    }

    public static void swipeUntil(By locator, double startPoint, double endPoint) {
     //   driver = Driver.getDriver();
        while (Driver.getDriver().findElements(locator).size() <= 0) {
            swipeV(startPoint, endPoint);
        }
    }
    public static void swipeAndClick(By locator, double startPoint, double endPoint) {
    //    driver = Driver.getDriver();
        while (Driver.getDriver().findElements(locator).size() <= 0) {
            swipeV(startPoint, endPoint);
        }
        Driver.getDriver().findElement(locator).click();
    }

    public static void clickToCoordinate(int x, int y) {
    //    driver = Driver.getDriver();
        new TouchAction<>(Driver.getDriver())
                .press(PointOption.point(x, y)).release().perform();

    }

    public static void clickNumbers(Integer num) {
      //  driver = Driver.getDriver();
        Driver.getDriver().findElement(By.xpath("//*[@content-desc='" + num + "']")).click();
    }

    public static void operators(String operator) {
      //  driver = Driver.getDriver();
        Driver.getDriver().findElement(By.xpath("//*[@content-desc='" + operator + "']")).click();
    }
}
