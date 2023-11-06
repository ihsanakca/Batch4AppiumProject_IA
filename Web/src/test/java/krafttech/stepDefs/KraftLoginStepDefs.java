package krafttech.stepDefs;

import com.krafttech.utilsWeb.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Map;

import static com.krafttech.utilsWeb.Locators.*;

public class KraftLoginStepDefs {
    WebDriver driver=Driver.getDriver();

    WebDriverWait wait=new WebDriverWait(driver,10);

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get(url);

    }
    @When("The user enters following credentials and press login button")
    public void the_user_enters_following_credentials_and_press_login_button(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lEmail)).sendKeys(map.get("email"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lPassword)).sendKeys(map.get("password"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLoginBtn)).click();


    }
    @Then("The user should be able to see own full name: {string} at the dashboard page")
    public void the_user_should_be_able_to_see_own_full_name_at_the_dashboard_page(String expectedName) {
        String actualName=wait.until(ExpectedConditions.visibilityOfElementLocated(lFullNameAtDashboard)).getText();
        Assert.assertEquals(actualName,expectedName);

    }
    @Then("The user closes the browser")
    public void the_user_closes_the_browser() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
    }

}
