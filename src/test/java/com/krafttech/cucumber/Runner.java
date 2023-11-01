package com.krafttech.cucumber;


import com.krafttech.utils.App;
import com.krafttech.utils.Device;
import com.krafttech.utils.Utils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.Arrays;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-html-reports.html"
        },
        features = {"src/test/java/com/krafttech/cucumber"},
        glue = {"com/krafttech/cucumber"},
        tags = "@wip"
)

public class Runner extends AbstractTestNGCucumberTests {
    @BeforeTest
    @Parameters({"device"})
    public void beforeTest(@Optional("a") String device) {

        if (Arrays.toString(Device.values()).contains(device)) {
            Utils.openApp(Device.valueOf(device), App.Calculator);
            System.out.println("device = " + device);

        } else {
            Utils.openApp(Device.Redmi_8, App.Calculator);
        }
    }
}
