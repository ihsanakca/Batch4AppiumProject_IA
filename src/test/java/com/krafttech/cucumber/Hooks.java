package com.krafttech.cucumber;



import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import io.cucumber.java.BeforeAll;


import com.krafttech.utils.MobileUtilities;


public class Hooks {


    @BeforeAll
    public static void beforeAll(){
       if(Driver.getDriver()==null){
           MobileUtilities.openApp(Device.Pixel_3, App.Calculator);
       }
    }
}
