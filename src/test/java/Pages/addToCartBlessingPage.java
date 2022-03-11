package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class addToCartBlessingPage extends TestBase {


    //Declared locators here


    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
    public static WebElement PrintedDress;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[2]/span")
    public static WebElement More;
    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement QuantityField_Clear;
    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement QuantityField_Add;
    @FindBy(how = How.ID, using = "group_1")
    public static WebElement SelectSize;
    @FindBy(how = How.ID, using = "color_24")
    public static WebElement SelectColour;
    @FindBy(how = How.ID, using = "add_to_cart")
    public static WebElement AddToCart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement ProceedToCheckout_1;
    @FindBy(how = How.ID, using = "total_price")
    public static WebElement TotalDressCost;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement ProceedToCheckout_2;
    @FindBy(how = How.CLASS_NAME, using = "form-control")
    public static WebElement AddComment;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement ProceedToCheckout_3;
    @FindBy(how = How.CLASS_NAME, using = "iframe")
    public static WebElement ReadTermsOfService;
    @FindBy(how = How.ID, using = "uniform-cgv")
    public static WebElement AgreeToTermsOfService;
    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement ProceedToCheckout_4;
    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    public static WebElement PayByBankWire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement IConfirmMyOrder;
    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    public static WebElement OrderConfirmation;
    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    public static WebElement ContactCustomerService;
    @FindBy(how = How.ID, using = "id_contact")
    public static WebElement SubjectHeading;
    @FindBy(how = How.NAME, using = "id_order")
    public static WebElement OrderReference;
    @FindBy(how = How.ID, using = "fileUpload")
    public static WebElement AttachFile;
    @FindBy(how = How.ID, using = "message")
    public static WebElement WriteMessage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"submitMessage\"]/span")
    public static WebElement SendMessageContact;
    @FindBy(how = How.LINK_TEXT, using = "alert alert-success")
    public static WebElement SendMessageSuccessfully;

    //Declared methods here

    public void HoverOnPrintedDress() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(driver);
        WebElement button = PrintedDress;
        action.moveToElement(button).perform();
    }

    public void ClickMore() {
        More.click();
    }

    public void ClearQty() {
        QuantityField_Clear.clear();
    }

    public void AddQty() {
        QuantityField_Add.sendKeys("2");
    }

    public void SelectSize() {
        SelectSize();
        {
            Select Size = new Select(SelectSize);
            Size.selectByVisibleText("M");
        }


    }

}

