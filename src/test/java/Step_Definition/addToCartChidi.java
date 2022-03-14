package Step_Definition;

import Base.TestBase;
import Pages.addToCartChidiPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class addToCartChidi extends TestBase {

    @When("^I navigate to my desired collection$")
    public void iNavigateToMyDesiredCollection() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ClickOnWomen();
    }

    @And("^I choose my desired clothing and add to cart and proceed$")
    public void iChooseMyDesiredClothingAndAddToCartAndProceed() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.Hover();
        page.ClickOnMore();
        page.ClearQuantity();
        page.AddQuantity();
        page.SelectSize();
        page.ClickAddToCart();
        page.ClickProceed1();
    }

    @And("^I confirm the item cost and proceed$")
    public void iConfirmTheItemCostAndProceed() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ConfirmCost();
        page.ClickProceed2();
        page.WriteComment();
        page.ClickProceed3();
    }

    @And("^I agree to the terms of service and proceed$")
    public void iAgreeToTheTermsOfServiceAndProceed() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ClickOnReadTC();
        page.CloseTC();
        page.ClickOnAgreeTC();
        page.ClickProceed4();
    }

    @And("^I confirm the total cost of item shipping and select payment method$")
    public void iConfirmTheTotalCostOfItemShippingAndSelectPaymentMethod() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ConfirmCost2();
        page.ClickOnPaymentMethod();
        page.ClickOnConfirmOrder();
    }

    @And("^I have my items checked out successfully$")
    public void iHaveMyItemsCheckedOutSuccessfully() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.AssertOrderConfirmation();
    }

    @And("^I navigate to contact us page$")
    public void iNavigateToContactUsPage() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ClickOnContactUs();
    }

    @And("^I enter all the appropriate details about my order$")
    public void iEnterAllTheAppropriateDetailsAboutMyOrder() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ChooseSubjectHeading();
        page.SelectOrderReference();
        page.SelectProduct();
        page.EnterMessage();
        page.HitOnAttachFile();
        page.ClickSend();
    }

    @Then("^I should have my message successfully sent to customer care$")
    public void iShouldHaveMyMessageSuccessfullySentToCustomerCare() {
        addToCartChidiPage page = PageFactory.initElements(driver, addToCartChidiPage.class);
        page.ConfirmationOfSentMsg();
    }

    
}
