package Step_Definition;

import Base.TestBase;
import Pages.registerNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerNewUseTest extends TestBase {






    @When("^I enter email to create a new account$")
    public void iEnterEmailToCreateANewAccount() {
        registerNewUserPage page = PageFactory.initElements(driver, registerNewUserPage.class);
        page.enterEmailforNewAccount();

    }

    @And("^I click on the create account button$")
    public void iClickOnTheCreateAccountButton() {
        registerNewUserPage page = PageFactory.initElements(driver, registerNewUserPage.class);
        page.clickCreateAccButton();
    }

    @And("^I enter all required details$")
    public void iEnterAllRequiredDetails() throws InterruptedException {
        Thread.sleep(5000);
        registerNewUserPage page = PageFactory.initElements(driver, registerNewUserPage.class);
        page.SelectCustGender();
        page.enterCustFirstName();
        page.enterCustLastName();
        page.enterAccPasswd();
        page.selectDOBday();
        page.selectDOMonth();
        page.selectDOByear();
        page.enterCustomerAdd();
        page.enterCustCity();
        page.selectState();
        page.enterCustPostCode();
        page.enterCustMobilePhoned();
        page.enterCustAddAlias();
    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        registerNewUserPage page = PageFactory.initElements(driver, registerNewUserPage.class);
        page.ClickRegisterButton();

    }

    @Then("^My account should be created successfully$")
    public void myAccountShouldBeCreatedSuccessfully() {
        registerNewUserPage page = PageFactory.initElements(driver, registerNewUserPage.class);
        page.AssertNewAccount();

        driver.quit();
    }




}
