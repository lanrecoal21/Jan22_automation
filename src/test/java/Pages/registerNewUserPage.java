package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class registerNewUserPage {
    public int random;

    //Declare all your locators here
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement  HomePagesignInLink;

    @FindBy(how = How.NAME, using = "email_create")
    public static WebElement  RegisterAccEmailField;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public static WebElement  CreateAccButton;

    @FindBy(how = How.ID, using = "uniform-id_gender2")
    public static WebElement  FemaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement  CustomerFirstName;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement  CustomerLastName;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement  AccPasswd;

    @FindBy(how = How.ID, using = "days")
    public static WebElement  DOBDay;

    @FindBy(how = How.ID, using = "months")
    public static WebElement  DOBmonths;

    @FindBy(how = How.ID, using = "years")
    public static WebElement  DOByears;

    @FindBy(how = How.NAME, using = "address1")
    public static WebElement  CustomerAddress;

    @FindBy(how = How.NAME, using = "city")
    public static WebElement  CustomerCity;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement  CustomerState;

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement  CustomerPostCode;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
    public static WebElement  RegisterButton;

    @FindBy(how = How.ID, using = "alias")
    public static WebElement  CustomerAddAlias;

    @FindBy(how = How.ID, using = "phone_mobile")
    public static WebElement  CustomerMobilePhone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement  NewCreatedUSer;


    //Declare your methods here

    public void clickSignInLink() {HomePagesignInLink.click();}
    public void enterEmailforNewAccount() {
        random = 100 + (int)(Math.random()* (1000-1) +1);
        RegisterAccEmailField.sendKeys("lanre.ikuesan+20" + random + "@gmail.com");
    }
    public void clickCreateAccButton() {CreateAccButton.click();}
    public void SelectCustGender() {FemaleGenderButton.click();}
    public void enterCustFirstName() {CustomerFirstName.sendKeys("Tinu");}
    public void enterCustLastName() {CustomerLastName.sendKeys("Sotunde");}
    public void enterAccPasswd() {AccPasswd.sendKeys("testing");}
    public void selectDOBday() {
        Select Day =new Select(DOBDay);
        Day.selectByIndex(10);
    }
    public void selectDOMonth() {
        Select month =new Select(DOBmonths);
        month.selectByIndex(9);
    }
    public void selectDOByear() {
        Select year =new Select(DOByears);
        year.selectByValue("1990");
    }
    public void enterCustomerAdd() {CustomerAddress.sendKeys("1 testing avenue");}
    public void enterCustCity() {CustomerCity.sendKeys("Chicago");}
    public void selectState() {
        Select State =new Select(CustomerState);
        State.selectByVisibleText("Illinois");}
    public void enterCustPostCode() {CustomerPostCode.sendKeys("00000");}
    public void enterCustMobilePhoned() {CustomerMobilePhone.sendKeys("123456789");}
    public void enterCustAddAlias() {CustomerAddAlias.sendKeys("Testing House");}
    public void ClickRegisterButton() {RegisterButton.click();}
    public void AssertNewAccount() {String NameOfNewUser = NewCreatedUSer.getText();
    System.out.println(NameOfNewUser);
    }






}
