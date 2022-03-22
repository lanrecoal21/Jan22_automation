package Step_Definition;

import Base.TestBase;
import Pages.addToCartKelechiPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCartKelechi extends TestBase {


    @When("^I enter correct email$")
    public void iEnterCorrectEmail() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.enterEmailAddress();
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.enterPassword();
    }

    @When("^I click the login link$")
    public void iClickTheLoginLink() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.clickLoginBtn();
    }

    @And("^I am successfully logged in$")
    public void iAmSuccessfullyLoggedIn() {
        String ExpectedLoggedInUser = "Sometimes YouWin";
        String ActualLoggedInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }

    @When("^I click on the dresses category link$")
    public void iClickOnTheDressesCategoryLink() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.dressLinkBtn();
    }

    @And("^I click an item \\(printed summer dress\\)$")
    public void iClickAnItemPrintedSummerDress() {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        actions.moveToElement(menuOption).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
    }

    @And("^I change the quantity to three$")
    public void iChangeTheQuantityToThree() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.summerDressQtyBtn();
        page.summerDressQtyBtn();
    }


    @And("^I change the size to M \\(medium\\)$")
    public void iChangeTheSizeToMMedium() {


        Select size = new Select(driver.findElement(By.id("group_1")));
        size.selectByValue("2");

    }

    @When("^I click the Add to Cart button$")
    public void iClickTheAddToCartButton() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setAddToCart();
    }

    @And("^I click the Proceed to Checkout button$")
    public void iClickTheProceedToCheckoutButton() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setProceedToCheckoutBtn();
        /*

        String unitPrice = driver.findElement(By.xpath("//*[@id=\"product_price_5_23_646014\"]/span[1]")).getText();
        String totalPrice = driver.findElement(By.xpath("//*[@id=\"total_price\"]")).getText();
        Assert.assertEquals(unitPrice, totalPrice);
        System.out.println(unitPrice);
        System.out.println(totalPrice);

         */
    }

    @And("^I click Proceed to Checkout button again$")
    public void iClickProceedToCheckoutButtonAgain() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setProceedToCheckoutBtn1();
    }

    @And("^I add a comment about the item selected in the text field$")
    public void iAddACommentAboutTheItemSelectedInTheTextField() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setOrderMessageTextField();
    }

    @When("^I click Proceed to Checkout$")
    public void iClickProceedToCheckout() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setProceedToCheckoutBtn2();
    }

    @And("^I accept the terms of service$")
    public void iAcceptTheTermsOfService() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setTermsOfService();
    }

    @And("^I click Proceed to Checkout button$")
    public void iClickProceedToCheckoutButton() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setProceedToCheckoutBtn3();
    }

    @When("^I select to pay by bank wire$")
    public void iSelectToPayByBankWire() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setPaymentMethodBankWire();
    }

    @And("^click the I confirm my order button$")
    public void clickTheIConfirmMyOrderButton() {
        addToCartKelechiPage page = PageFactory.initElements(driver, addToCartKelechiPage.class);
        page.setConfirmOrderBtn();
    }

    @Then("^I should receive an order confirmation$")
    public void iShouldReceiveAnOrderConfirmation() {
        String ExpectedConfMessage = "ORDER CONFIRMATION";
        String ActualConfMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(ExpectedConfMessage, ActualConfMessage);
        System.out.println(ActualConfMessage);

        driver.quit();
    }




}
