package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class EmployeeSearchPage {
    @FindBy(className = "oxd-autocomplete-text-input")  // name
    @CacheLookup
    WebElement txt_username;

    @FindBy(className = "oxd-input oxd-input--active")
    WebElement txt_EmpId;

    @FindBy(className = "oxd-select-text--active")
    WebElement status_dropdown;

    @FindBy(className = "oxd-select-text--active")
    WebElement include;

    @FindBy(className = "oxd-autocomplete-text-input")
    WebElement supervisor_name;

    @FindBy(className = "oxd-select-text-input")
    WebElement job_title_dropDown;

    @FindBy(className = "oxd-select-text--active")
    WebElement sub_unit_dropdown;

    @FindBy(className = "orangehrm-left-space")
    WebElement btn_submit;

//    @FindBy(partialLinkText = "raghav")
//    List<WebElement> myLinks;
//
//    @FindBy(how = How.ID, using = "name")
//    WebElement abc;

    WebDriver driver;


    public EmployeeSearchPage(WebDriver driver) {
        this.driver = driver;


        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterEmpId(String username) {
        txt_EmpId.sendKeys(username);
    }

    public void enterStatus(String password) {
        status_dropdown.sendKeys(password);
    }

    public void include(String password) {
        include.sendKeys(password);
    }

    public void enterSupervisor_name(String password) {
        supervisor_name.sendKeys(password);
    }

    public void Enter_job_title_dropDown(String password) {
        job_title_dropDown.sendKeys(password);
    }

    public void enter_sub_unit_dropdown(String password) {
        sub_unit_dropdown.sendKeys(password);
    }

    public void clickOnSubmit() {
        btn_submit.click();
    }
}
