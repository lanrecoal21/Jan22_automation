package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validloginTest extends TestBase {




    @When("^I enter valid username$")
    public void i_enter_valid_username() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("lanre.ikuesan@gmail.com");

    }

    @When("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys("testing");

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        String ExpectedLoggedUSer = "femi Paul";
        String ActualLoggedUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedUSer, ActualLoggedUser);
        System.out.println(ActualLoggedUser);

        driver.quit();

    }
}
