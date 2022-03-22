package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addToCartKelechiPage {


    @FindBy(how = How.ID, using = "email")
    public static WebElement  EmailField;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement  PasswordField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement  LoginLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public static WebElement  DressLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
    public static WebElement  SummerDressQty;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement  MediumSize;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement  AddToCartBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement  ProceedToCheckoutBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement  ProceedToCheckoutBtn1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ordermsg\"]/textarea")
    public static WebElement  OrderMessageTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement  ProceedToCheckoutBtn2;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement  TermsOfService;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement  ProceedToCheckoutBtn3;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public static WebElement  PaymentMethodBankWire;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement  ConfirmOrderBtn;




    public void enterEmailAddress(){
        EmailField.sendKeys("koten48208@shackvine.com");
    }

    public void enterPassword(){
        PasswordField.sendKeys("testing");
    }

    public void clickLoginBtn(){
        LoginLink.click();
    }

    public void dressLinkBtn(){
        DressLink.click();
    }

    public void summerDressQtyBtn(){
        SummerDressQty.click();
    }

    public void dressMediumSize(){
        MediumSize.click();
    }

    public void setAddToCart(){
        AddToCartBtn.click();
    }

    public void setProceedToCheckoutBtn(){
        ProceedToCheckoutBtn.click();
    }

    public void setProceedToCheckoutBtn1(){
        ProceedToCheckoutBtn1.click();
    }

    public void setOrderMessageTextField(){
        OrderMessageTextField.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis et consequat nisi, eu porttitor sapien. Nulla facilisi. Donec mattis dolor enim. Fusce euismod diam vitae interdum placerat. Integer eget nibh at tortor vehicula rutrum. In aliquet imperdiet nisi bibendum viverra. Vestibulum faucibus nec arcu ac viverra. Fusce sit amet iaculis metus. Morbi ac porta velit.");
    }

    public void setProceedToCheckoutBtn2(){
        ProceedToCheckoutBtn2.click();
    }

    public void setTermsOfService(){
        TermsOfService.click();
    }

    public void setProceedToCheckoutBtn3(){
        ProceedToCheckoutBtn3.click();
    }

    public void setPaymentMethodBankWire(){
        PaymentMethodBankWire.click();
    }

    public void setConfirmOrderBtn(){
        ConfirmOrderBtn.click();
    }




}
