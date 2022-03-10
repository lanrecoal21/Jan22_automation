package Step_Definition;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLogin extends TestBase {





    @When("^You enter \"([^\"]*)\" address$")
    public void youEnterAddress(String email) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(email);

    }

    @And("^You enter my \"([^\"]*)\"$")
    public void youEnterMy(String password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(password);

    }

    @When("^We click the login button$")
    public void weClickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    @Then("^we should get the correct \"([^\"]*)\"$")
    public void weShouldGetTheCorrect(String errorMessage) throws Throwable {
        String ExpectedLoggedUSer = errorMessage;
        String ActualLoggedUser = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedLoggedUSer, ActualLoggedUser);
        System.out.println(ActualLoggedUser);



    }
}
