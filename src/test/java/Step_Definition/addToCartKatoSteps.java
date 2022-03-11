package Step_Definition;

import Base.TestBase;
import Pages.addToCartKatoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class addToCartKatoSteps extends TestBase {

    @When("^I navigates to collection$")
    public void iNavigatesToCollection() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.ClickOnWomen();
    }

    @And("^I selects desired shirt and add to cart and proceed$")
    public void iSelectsDesiredShirtAndAddToCartAndProceed() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.HoverOverProduct();
        page.ClickMore();
        page.ClearQty();
        page.AddQty();
        page.SizeSelector();
        page.ClickToAddToCart();
        page.ClickToProceed1();
    }

    @And("^I confirms the cost of item selected and proceed$")
    public void iConfirmsTheCostOfItemSelectedAndProceed() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.ClickToProceed2();
        page.EnterComment();
        page.ClickToProceed3();
    }

    @And("^I agreed to the Terms and Conditions and proceed$")
    public void iAgreedToTheTermsAndConditionsAndProceeds() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.ClickOnReadTermsCondition();
        page.CloseTermsAndCondition();
        page.ClickToAgreeToTermsCons();
        page.ClickToProceed4();
    }

    @And("^I confirms the Total cost of shipping item and select payment method$")
    public void iConfirmsTheTotalCostOfShippingItemAndSelectPaymentMethod() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.ClickPaymentMethod();
        page.ClickConfirm_Order();
        page.AssertConfirmationOrder();

    }

    @And("^I check out items successfully$")
    public void iCheckOutItemsSuccessfully() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
    }

    @And("^I navigates to the contact us$")
    public void iNavigatesToTheContactUs() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.ClickContact_Us();
    }

    @And("^I enters all required details of order$")
    public void iEntersAllRequiredDetailsOfOrder() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.Choose_Subject_heading();
        page.SelectOrderRef();
        page.SelectProduct();
        page.Enter_Message();
        page.ClickOnSend();
    }

    @Then("^I should have message sent successfully to customer care$")
    public void iShouldHaveMessageSentSuccessfullyToCustomerCare() {
        addToCartKatoPage page = PageFactory.initElements(driver, addToCartKatoPage.class);
        page.Confirmatory_Message();
    }
}
