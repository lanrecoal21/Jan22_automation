package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class addToCartKatoPage  extends TestBase {

    //Locators Declared Here
    @FindBy(how = How.LINK_TEXT, using = "WOMEN")
    public static WebElement ClothingCollection;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public static WebElement Hover_on_Product;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]/span")
    public static WebElement More_;
    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement Quantity_Field_Clear;
    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement Quantity_Field_Add;
    @FindBy(how = How.ID, using = "group_1")
    public static WebElement Size_Selector;
    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement Add_to_Cart_button;
    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement Proceed_to_CheckOut_1;
    @FindBy(how = How.ID, using = "total_price_container")
    public static WebElement Total_ItemCost;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement Proceed_to_Checkout_2;
    @FindBy(how = How.CLASS_NAME, using = "form-control")
    public static WebElement Add_Comment_Box;
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement Proceed_to_Checkout_3;
    @FindBy(how = How.CLASS_NAME, using = "iframe")
    public static WebElement Read_Terms_Condition;
    @FindBy(how = How.XPATH, using = "//*[@id=\"order\"]/div[2]/div/div/a")
    public static WebElement TermsCondition_PopUp;
    @FindBy(how = How.ID, using = "cgv")
    public static WebElement Agree_to_Terms_Condition;
    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement Proceed_to_CheckOut_4;
    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    public static WebElement Payment_Method;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement I_ConfirmMyOrder;
    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    public static WebElement Order_Confirmation;
    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    public static WebElement Contact_Customer_Service;
    @FindBy(how = How.ID, using = "id_contact")
    public static WebElement Subject_Heading;
    @FindBy(how = How.NAME, using = "id_order")
    public static WebElement Order_Ref;
    @FindBy(how = How.NAME, using = "id_product")
    public static WebElement Product_Heading;
    @FindBy(how = How.ID, using = "message")
    public static WebElement Message_Box;
    @FindBy(how = How.XPATH, using = "//*[@id=\"submitMessage\"]/span")
    public static WebElement Send_Message_Button;
    @FindBy(how = How.CLASS_NAME, using = "alert alert-success")
    public static WebElement Message_Sent;

//Methods Declared Here

    public void ClickOnWomen() {ClothingCollection.click();}
    public void HoverOverProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(driver);
        WebElement button = Hover_on_Product;
        action.moveToElement(button).perform();
    }
    public void ClickMore() {More_.click();}
    public void ClearQty() {Quantity_Field_Clear.clear();}
    public void AddQty() {Quantity_Field_Add.sendKeys("4");}
    public void SizeSelector() {
        Select Size = new Select(Size_Selector);
        Size.selectByVisibleText("L");
    }

    public void ClickToAddToCart() {Add_to_Cart_button.click();}
    public void ClickToProceed1() {Proceed_to_CheckOut_1.click();}

    public void ClickToProceed2() {Proceed_to_Checkout_2.click();}
    public void EnterComment() {Add_Comment_Box.sendKeys("Doors are always locked, Please Call");}
    public void ClickToProceed3() {Proceed_to_Checkout_3.click();}

    public void ClickOnReadTermsCondition() {Read_Terms_Condition.click();}
    public void CloseTermsAndCondition() {TermsCondition_PopUp.click();}
    public void ClickToAgreeToTermsCons() {Agree_to_Terms_Condition.click();}
    public void ClickToProceed4() {Proceed_to_CheckOut_4.click();}

    public void ClickPaymentMethod() {Payment_Method.click();}
    public void ClickConfirm_Order() {Order_Confirmation.click();}
    public void AssertConfirmationOrder() {
        String NameOfNewUser = I_ConfirmMyOrder.getText();
        System.out.println(NameOfNewUser);
       }
    public void ClickContact_Us() {Contact_Customer_Service.click();}
    public void Choose_Subject_heading() {
        Select Heading = new Select(Subject_Heading);
        Heading.selectByIndex(1);
        }
    public void SelectOrderRef() {
        Select Reference = new Select(Order_Ref);
        Reference.selectByIndex(1);
    }
    public void SelectProduct() {
        Select Product = new Select(Product_Heading);
        Product.selectByIndex(1);
    }
    public void Enter_Message() {Message_Box.sendKeys("Order can be delivered between 8-10 and 17-20");}
    public void ClickOnSend() {Send_Message_Button.click();}
    public void Confirmatory_Message() {Message_Sent.isDisplayed();
    }


}
