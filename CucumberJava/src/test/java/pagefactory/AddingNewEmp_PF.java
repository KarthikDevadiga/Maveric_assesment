package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddingNewEmp_PF {
    @FindBy(className = "orangehrm-firstname")  // name
    @CacheLookup
    WebElement txt_Firstname;


    @FindBy(className = "orangehrm-middlename")
    WebElement txt_MidName;


    @FindBy(className = "orangehrm-lastname")
    WebElement txt_Last_name;



    @FindBy(className = "orangehrm-left-space")
    WebElement btn_save;

    WebDriver driver;

    public AddingNewEmp_PF(WebDriver driver) {
        this.driver = driver;


        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void enterFirstName(String username) {
        txt_Firstname.sendKeys(username);
    }
    public void enterMiddleName(String username) {
        txt_MidName.sendKeys(username);
    }
    public void enterLastName(String username) {
        txt_Last_name.sendKeys(username);
    }

    public void clickSave() {
        btn_save.click();
    }
}
