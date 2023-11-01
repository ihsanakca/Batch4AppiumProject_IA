package com.krafttech.cucumber;


import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Driver;
import com.krafttech.utils.Utils;
import io.cucumber.java.BeforeAll;



public class Hooks {


    @BeforeAll
    public static void beforeAll(){
       if(Driver.getDriver()==null){
           Utils.openApp(Device.Redmi_8, App.Calculator);
       }
    }
}
