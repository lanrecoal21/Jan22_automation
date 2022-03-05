package Step_Definition;

import Base.TestBase;
import Pages.registerNewUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.URL;


public class common extends TestBase {



    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application homepage$")
    public void iAmOnTheApplicationHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

    @And("^I select the sign link$")
    public void iSelectTheSignLink() {
        registerNewUserPage Page = PageFactory.initElements(driver, registerNewUserPage.class);
        Page.clickSignInLink();
    }
}
