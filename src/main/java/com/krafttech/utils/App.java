package com.krafttech.utils;

public enum App {
    ApiDemos("com.touchboarder.android.api.demos","com.touchboarder.androidapidemos.MainActivity","API_Demos.zip"),
    Calculator("com.google.android.calculator","com.android.calculator2.Calculator",""),
    Getir("","","");

    public String appPackage;
    public String appActivity;
    public String appZipFile;

    App(String appPackage, String appActivity,String appZipFile) {
        this.appPackage=appPackage;
        this.appActivity=appActivity;
        this.appZipFile=appZipFile;
    }
}
