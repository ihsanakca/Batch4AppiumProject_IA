package com.krafttech.utilsWeb;

import org.openqa.selenium.By;

public interface Locators {
    String url="https://www.krafttechexlab.com/login";

    By lEmail =By.id("email");
    By lPassword =By.id("yourPassword");
    By lLoginBtn=By.tagName("button");
    By lFullNameAtDashboard=By.tagName("h2");

}
