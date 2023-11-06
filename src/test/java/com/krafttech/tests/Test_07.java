package com.krafttech.tests;

import com.krafttech.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static com.krafttech.utils.MobileUtilities.*;

public class Test_07 extends TestBase {

    By lTamam = By.id("android:id/button1");
    By lviews = By.xpath("//*[@text='Views']");

    By lwebView = By.xpath("//*[@text='WebView']");


    @Test
    public void test1() {

        clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");
        swipeV(.9, .3);
        swipeV(.9, .3);
        swipeV(.2, .8);


    }

    @Test
    public void test2() {

        clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
       clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");

        swipeUntil(lwebView, .8, .2);

        clickWithText("WebView");


    }

    @Test
    public void test3() {
        driver.findElement(By.xpath("//*[@text='Continue']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));

        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lviews)).click();

        swipeAndClick(lwebView, .7, .2);

    }

}
