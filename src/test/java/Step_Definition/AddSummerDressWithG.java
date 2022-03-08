package Step_Definition;

import Base.TestBase;
import Pages.AddSummerDressWithGPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AddSummerDressWithG extends TestBase {

    @Given("^I hover on product$")
    public void i_hover_on_product()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.HoverOnThePSDWGlasses();

    }

    @Given("^I click on more$")
    public void i_click_on_more() throws Throwable {

    }

    @Given("^I change product quantity$")
    public void i_change_product_quantity() throws Throwable {

    }

    @Given("^I change product size$")
    public void i_change_product_size() throws Throwable {

    }

    @Given("^I add product to cart$")
    public void i_add_product_to_cart() throws Throwable {

    }
    @When("^I confirm my order is successful$")
    public void i_confirm_my_order_is_successful() throws Throwable {

    }

    @When("^I proceed to checkout$")
    public void i_proceed_to_checkout() throws Throwable {

    }
    @When("^I confirm the total sum is correct$")
    public void i_confirm_the_total_sum_is_correct() throws Throwable {

    }
    @When("^I click on proceed to checkout$")
    public void iClickOnProceedToCheckout() {
    }

    @When("^I go to contact us$")
    public void i_go_to_contact_us() throws Throwable {

    }

    @When("^I enter message to the support team$")
    public void i_enter_message_to_the_support_team() throws Throwable {

    }
    @And("^I proceed to checkout again$")
    public void iProceedToCheckoutAgain() {
    }

    @And("^I agree the terms$")
    public void iAgreeTheTerms() {
    }

    @And("^I select payment method$")
    public void iSelectPaymentMethod() {
    }

    @When("^I confirm my order$")
    public void iConfirmMyOrder() {
    }

    @Then("^My order should be send successfully$")
    public void my_message_should_be_send_successfully() throws Throwable {

    }



}
