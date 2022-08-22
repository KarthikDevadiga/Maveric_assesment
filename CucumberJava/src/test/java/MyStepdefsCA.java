import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class MyStepdefsCA {

    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;
    @Given("user opens the browser")
    public void userOpensThePage() {
        System.out.println("  ===  I am inside LoginDemoSteps_PF class ===== ");

        System.out.println("Inside Step - browser is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);

        //System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
        String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", filePath);
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("user is on register page")
    public void userIsOnRegisterPage() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
    }
}
