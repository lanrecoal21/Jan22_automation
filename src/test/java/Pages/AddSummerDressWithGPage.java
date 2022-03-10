package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddSummerDressWithGPage extends TestBase {


    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/h5/a")
    public static WebElement PrintedSDWGlasses;

    //@FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[2]/span")
    //public static WebElement ClickOnMore;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public static WebElement ClickPaymentMethod;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement ClickConfirmOrder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
    public static WebElement CompleteOrderMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contact-link\"]/a")
    public static WebElement ContactUsIcon;

    @FindBy(how = How.ID, using = "id_contact")
    public static WebElement SubjectHeadings;

    @FindBy(how = How.ID_OR_NAME, using = "id_order")
    public static WebElement OrderReference;

    @FindBy(how = How.ID, using = "408253_order_products")
    public static WebElement SelectProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"fileUpload\"]")
    public static WebElement ChooseFiles;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public static WebElement DRESSES;

    //@FindBy(how = How.XPATH, using = "//*[@id=\"fileUpload\"]")
   // public static WebElement ChooseFile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"message\"]")
    public static WebElement MessageAboutMyProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitMessage\"]/span")
    public static WebElement ClickTheSendKey;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p")
    public static WebElement OrderSuccessMessage;





    public void TopDresses() {DRESSES.click();}
    public void HoverOnThePSDWGlasses() {PrintedSDWGlasses.click();
    }

    //public void More() {ClickOnMore.click();}
    public void IncreaseProductQty() {IncreaseQuantityByOne.click();}
    public void SelectSize() {
        Select ClothSize = new Select (DressSize);
        ClothSize.selectByIndex(2);
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
    public void Confirmation() {CompleteOrderMessage.click();}
    public void ClickContactUsLogo() {ContactUsIcon.click();}
    public void SelectSubjectHeading() {
        Select SubjectHeading = new Select (SubjectHeadings);
        SubjectHeading.selectByIndex(1);}
    public void SelectOrderReference() {
        Select OrderReferences = new Select (OrderReference);
        OrderReferences.selectByIndex(2);}
    //public void SelectTheProduct() {
       // Select SelectTheProducts = new Select (SelectProduct);
        //SelectTheProducts.selectByIndex(1);}


    public void ClickOnChooseFiles() {ChooseFiles.sendKeys("C:/Users/araba/Automation assigment image");}

    public void MessageToSupport() {MessageAboutMyProduct.sendKeys("I want it fitted");}
    public void ClickOnSend() {ClickTheSendKey.click();}
    public void ConfirmationMessage() {OrderSuccessMessage.isDisplayed();}
}
