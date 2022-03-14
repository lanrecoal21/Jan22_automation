package Step_Definition;

import Base.TestBase;
import Pages.AddSummerDressWithGPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class AddSummerDressWithGla extends TestBase {

    @Given("^I click on dresses$")
    public void iClickOnDresses() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.TopDresses();
    }

    @Given("^I hover on product$")
    public void i_hover_on_product()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.HoverOnThePSDWGlasses();

    }

    //@Given("^I click on more$")
    //public void i_click_on_more() {
        //AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        //page.More();


    @Given("^I change product quantity$")
    public void i_change_product_quantity()  {

        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.IncreaseProductQty();

    }

    @Given("^I change product size$")
    public void i_change_product_size() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.SelectSize();

    }

    @Given("^I add product to cart$")
    public void i_add_product_to_cart()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.AddToCartButton();

    }
    @When("^I confirm my order is successful$")
    public void i_confirm_my_order_is_successful() throws InterruptedException {
        Thread.sleep(5000);
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ProductAddedSuccessfully();


    }

    @When("^I proceed to checkout$")
    public void i_proceed_to_checkout()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ProceedTOCO();

    }
    @When("^I confirm the total sum is correct$")
    public void i_confirm_the_total_sum_is_correct()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.FinalPrice();

    }
    @When("^I click on proceed to checkouts$")
    public void iClickOnProceedToCheckout() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ProceedTOCOut();}


    @When("^I go to contact us$")
    public void i_go_to_contact_us()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.MessageToStore();

    }

    @When("^I enter message to the support team$")
    public void i_enter_message_to_the_support_team()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ProceedTOChOut();

    }
    @And("^I proceed to checkout again$")
    public void iProceedToCheckoutAgain() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.IAgreeToTerms();
    }

    @And("^I agree the terms$")
    public void iAgreeTheTerms() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ProceedTOCheOut();
    }

    @And("^I select payment method$")
    public void iSelectPaymentMethod() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.SelectPaymentMethod();
    }

    @When("^I confirm my order$")
    public void iConfirmMyOrder() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ConfirmOrder();
    }

    @Then("^My order should be send successfully$")
    public void my_message_should_be_send_successfully()  {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.Confirmation();

    }


    @When("^I click on contact uss$")
    public void iClickOnContactUss() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ClickContactUsLogo();
    }

    @And("^I select customer services$")
    public void iSelectCustomerServices() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.SelectSubjectHeading();
    }

    @And("^I selected my order reference$")
    public void iSelectedMyOrderReference() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.SelectOrderReference();
    }

    //@And("^i select product$")
    //public void iSelectProduct() throws InterruptedException {
        //Thread.sleep(3000);
        //AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        //page.SelectTheProduct();


    @When("^I click on choose file$")
    public void iClickOnChooseFile() throws InterruptedException{
        Thread.sleep(4000);
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ClickOnChooseFiles();
    }


    @And("^I write message to support$")
    public void iWriteMessageToSupport() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.MessageToSupport();
    }

    @When("^I click on send$")
    public void iClickOnSend() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ClickOnSend();
    }

    @Then("^My message should be sent$")
    public void myMessageShouldBeSent() {
        AddSummerDressWithGPage page = PageFactory.initElements(driver, AddSummerDressWithGPage.class);
        page.ConfirmationMessage();
    }


}
