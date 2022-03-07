package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddSummerDressWithGPage extends TestBase {
    public int random;

    @FindBy(how = How.CLASS_NAME, using = "sf-with-ul")
    public static WebElement DRESSESOnHomePage;

    @FindBy(how = How.CLASS_NAME, using = "replace-2x img-responsive")
    public static WebElement PrintedSummerDressWithG;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
    public static WebElement IncreaseQuantityByOne;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement QuantityIncreasedByOne;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement DressSize;

    @FindBy(how = How.CLASS_NAME, using = "sf-with-ul")
    public static WebElement DRESSESONHOMEPAGE;

    //@FindBy(how = How.CLASS_NAME, using = "sf-with-ul")
    //public static WebElement DRESSESONHOMEPAGE;
}
