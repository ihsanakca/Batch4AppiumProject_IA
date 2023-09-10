package com.krafttech.tests;

import com.krafttech.TestBase;
import com.krafttech.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Test_07 extends TestBase {

    By lTamam = By.id("android:id/button1");

    By lwebView=By.xpath("//*[@text='WebView']");


    @Test
    public void test1() {

        Utils.clickWithText("DEVAM");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("Tamam");
        Utils.clickWithText("TAMAM");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");
        Utils.swipeV(.9,.3);
        Utils.swipeV(.9,.3);
        Utils.swipeV(.2,.8);


    }

    @Test
    public void test2() {

        Utils.clickWithText("DEVAM");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("Tamam");
        Utils.clickWithText("TAMAM");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");

        Utils.swipeUntil(lwebView,.8,.2);

        Utils.clickWithText("WebView");


    }

}
