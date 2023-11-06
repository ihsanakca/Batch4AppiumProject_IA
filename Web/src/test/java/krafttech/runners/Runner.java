package krafttech.runners;

import com.krafttech.utilsWeb.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-html-reports.html"},
        features = {"src/test/java/krafttech/features"},
        glue = {"krafttech/stepDefs"},
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {
    @BeforeTest
    @Parameters("environment")
    public void beforeTest(@Optional("pc") String environment){
        if (environment.equalsIgnoreCase("mobile"))
            Driver.getMobileDriver();
        else
            Driver.getDriver();
    }
}
