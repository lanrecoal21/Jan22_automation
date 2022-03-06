package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class CheckLogo extends TestBase {
    @Then("^Application logo should be displayed$")
    public void applicationLogoShouldBeDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
    }
}
