package Pages;

import Base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class addToCartChidiPage extends TestBase {

    //locators declared below

    @FindBy(how = How.LINK_TEXT, using = "WOMEN")
    public static WebElement categoryOfClothing;

    @FindBy(how = How.LINK_TEXT, using = "More")
    public static WebElement moreInfoOnItem;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement clearQuantityField;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement addQuantityWanted;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement sizeSelector;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement proceedToCheckout1;

    @FindBy(how = How.ID, using = "total_price_container")
    public static WebElement totalItemCost;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement proceedToCheckout2;

    @FindBy(how = How.CLASS_NAME, using = "form-control")
    public static WebElement addComment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement proceedToCheckout3;

    @FindBy(how = How.LINK_TEXT, using = "Read the Terms of Service")
    public static WebElement readTC;

    @FindBy(how = How.CLASS_NAME, using = "fancybox-item fancybox-close")
    public static WebElement popupTC;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement agreeTC;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement proceedToCheckout4;

    @FindBy(how = How.ID, using = "total_price")
    public static WebElement totalItemCostWithShipping;

    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    public static WebElement bankWirePayment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement iConfirmMyOrder;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    public static WebElement orderConfirmed;


    //methods declared below

    public void ClickOnWomen() {categoryOfClothing.click();}
    public void ClickOnMore() {moreInfoOnItem.click();}
    public void ClearQuantity() {clearQuantityField.clear();}
    public void AddQuantity() {addQuantityWanted.sendKeys("2");}
    public void SelectSize() {
        Select Size = new Select(sizeSelector);
        Size.selectByVisibleText("M");
    }

    public void ClickAddToCart() {addToCart.click();}
    public void ClickProceed1() {proceedToCheckout1.click();}
    public void ConfirmCost() {

        //String NameOfNewUser = NewCreatedUSer.getText();
        //System.out.println(NameOfNewUser);
    }

    public void ClickProceed2() {proceedToCheckout2.click();}
    public void WriteComment() {addComment.sendKeys("I live on the 99th floor");}
    public void ClickProceed3() {proceedToCheckout3.click();}
    public void ClickOnReadTC() {readTC.click();}
    public void CloseTC() {popupTC.click();}
    public void ClickOnAgreeTC() {agreeTC.click();}
    public void ClickProceed4() {proceedToCheckout4.click();}
    public void ConfirmCost2() {

        //String NameOfNewUser = NewCreatedUSer.getText();
        //    System.out.println(NameOfNewUser);
    }

    public void ClickOnPaymentMethod() {bankWirePayment.click();}
    public void ClickOnConfirmOrder() {iConfirmMyOrder.click();}
    public void AssertOrderConfirmation() {

        //String NameOfNewUser = NewCreatedUSer.getText();
        //    System.out.println(NameOfNewUser);
    }



}
