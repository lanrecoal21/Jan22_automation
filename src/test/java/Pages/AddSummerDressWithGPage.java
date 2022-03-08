package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddSummerDressWithGPage extends TestBase {
    public int random;

    @FindBy(how = How.CLASS_NAME, using = "replace-2x img-responsive")
    public static WebElement PrintedSDWGlasses;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[2]/span")
    public static WebElement ClickOnMore;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
    public static WebElement IncreaseQuantityByOne;


    @FindBy(how = How.ID, using = "group_1")
    public static WebElement DressSize;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement ClickAddToCartButton;

    //Wait 5 second

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    public static WebElement ProductSuccessMessageDisplayed;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement ClickProceedToCheckout;

    @FindBy(how = How.ID, using = "total_price")
    public static WebElement TotalPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement ProceedToCheckout;

    @FindBy(how = How.CLASS_NAME, using = "form-control")
    public static WebElement EnterProductMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement IProceedToCheckOut;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement ClickAgreeToTerms;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement ProceedAgain;

    @FindBy(how = How.ID_OR_NAME, using = "Pay by bank wire")
    public static WebElement ClickPaymentMethod;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement ClickConfirmOrder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
    public static WebElement CompleteOrderMessage;


    public void HoverOnThePSDWGlasses() {PrintedSDWGlasses.getLocation();}
    public void More() {ClickOnMore.click();}
    public void IncreaseProductQty() {IncreaseQuantityByOne.click();}
    public void SelectSize() {
        Select ClothSize = new Select (DressSize);
        ClothSize.selectByValue("L");
    }
    public void AddToCartButton() {ClickAddToCartButton.click();}
    //wait five seconds
    public void ProductAddedSuccessfully() {ProductSuccessMessageDisplayed.isDisplayed();}
    public void ProceedTOCO() {ClickProceedToCheckout.click();}
    public void FinalPrice() {TotalPrice.isDisplayed();}

    public void ProceedTOCOut() {ProceedToCheckout.click();}
    public void MessageToStore() {EnterProductMessage.sendKeys("Pack it very well. Thanks");}

    public void ProceedTOChOut() {IProceedToCheckOut.click();}
    public void IAgreeToTerms() {ClickAgreeToTerms.click();}
    public void ProceedTOCheOut() {ProceedAgain.click();}
    public void SelectPaymentMethod() {ClickPaymentMethod.click();}
    public void ConfirmOrder() {ClickConfirmOrder.click();}
    public void ConfirmationMessage() {CompleteOrderMessage.isDisplayed();}
}
