package Pages;

import Base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class addToCartChidiPage extends TestBase {

    //locators declared below

    @FindBy(how = How.LINK_TEXT, using = "WOMEN")
    public static WebElement categoryOfClothing;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
    public static WebElement hoverProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]/span")
    public static WebElement more;

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

    @FindBy(how = How.CLASS_NAME, using = "iframe")
    public static WebElement readTC;

    @FindBy(how = How.XPATH, using = "//*[@id=\"order\"]/div[2]/div/div/a")
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

    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    public static WebElement contactUs;

    @FindBy(how = How.ID, using = "id_contact")
    public static WebElement subjectHeading;

    @FindBy(how = How.NAME, using = "id_order")
    public static WebElement orderReference;

    @FindBy(how = How.NAME, using = "id_product")
    public static WebElement product;

    @FindBy(how = How.ID, using = "message")
    public static WebElement message;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitMessage\"]/span")
    public static WebElement sendMessage;

    @FindBy(how = How.CLASS_NAME, using = "alert alert-success")
    public static WebElement messageSent;


    //methods declared below

    public void ClickOnWomen() {categoryOfClothing.click();}
    public void Hover() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(driver);
        WebElement btn = hoverProduct;
        action.moveToElement(btn).perform();
    }
    public void ClickOnMore() {more.click();}
    public void ClearQuantity() {clearQuantityField.clear();}
    public void AddQuantity() {addQuantityWanted.sendKeys("2");}
    public void SelectSize() {
        Select Size = new Select(sizeSelector);
        Size.selectByVisibleText("M");
    }

    public void ClickAddToCart() {addToCart.click();}
    public void ClickProceed1() {proceedToCheckout1.click();}
    public void ConfirmCost() {

        //driver.get(totalItemCost);
        //String ActualtotalItemCost = driver.getTitle();
        //String ExpectedtotalItemCost = new String("$52.00");
        //softassert.assertEquals(ExpectedtotalItemCost, ActualtotalItemCost);
        //System.out.println(totalItemCost);

    }

    public void ClickProceed2() {proceedToCheckout2.click();}
    public void WriteComment() {addComment.sendKeys("I live on the 99th floor");}
    public void ClickProceed3() {proceedToCheckout3.click();}
    public void ClickOnReadTC() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        readTC.click();
    }
    public void CloseTC() {popupTC.click();}
    public void ClickOnAgreeTC() {agreeTC.click();}
    public void ClickProceed4() {proceedToCheckout4.click();}
    public void ConfirmCost2() {

        //driver.get(totalItemCostWithShipping);
        //String ActualtotalItemCostWithShipping = driver.getTitle();
        //String ExpectedtotalItemCostWithShipping = new String("$54.00");
        //softassert.assertEquals(ExpectedtotalItemCostWithShipping, ActualtotalItemCostWithShipping);
        //System.out.println(totalItemCostWithShipping);
    }

    public void ClickOnPaymentMethod() {bankWirePayment.click();}
    public void ClickOnConfirmOrder() {iConfirmMyOrder.click();}
    public void AssertOrderConfirmation() {

        //String NameOfNewUser = NewCreatedUSer.getText();
        //    System.out.println(NameOfNewUser);
    }

    public void ClickOnContactUs() {contactUs.click();}
    public void ChooseSubjectHeading() {
        Select Heading = new Select(subjectHeading);
        Heading.selectByIndex(1);
    }
    public void SelectOrderReference() {
        Select Reference = new Select(orderReference);
        Reference.selectByIndex(1);
    }
    public void SelectProduct() {
        Select Product = new Select(product);
        Product.selectByIndex(1);
    }
    public void EnterMessage() {message.sendKeys("Have my order delivered before 15:00");}
    public void ClickSend() {sendMessage.click();}
    public void ConfirmationOfSentMsg() {
        //String NameOfNewUser = NewCreatedUSer.getText();
        //    System.out.println(NameOfNewUser);
    }




}
