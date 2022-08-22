package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pagefactory.AddingNewEmp_PF;
import pagefactory.EmployeeSearchPage;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	EmployeeSearchPage es;

	AddingNewEmp_PF ap;


	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		
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
		
		//driver.manage().window().maximize();
		
	}

	@And("user is navigated to register page")
	public void user_is_on_register_page() {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		login = new LoginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		// driver.findElement(By.id("name")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickOnLogin();
		// driver.findElement(By.id("login")).click();
	}

//	@Then("logout link is displayed")
//	public void logoutLinkIsDisplayed() {
//
//	}

	@When("user submits {string} and {string}")
	public void userSubmitsAnd(String arg0, String arg1) {
		es.enterUsername(arg0);
		es.enterEmpId(arg1);

	}

	@When("user submitsEtS {string} and {string}")
	public void userSubmitsEtSAnd(String arg0, String arg1) {
		es.enterStatus(arg0);
		es.enterSupervisor_name(arg1);
	}

	@When("user submitsJTU {string} and {string}")
	public void userSubmitsJTUAnd(String arg0, String arg1) {
		es.Enter_job_title_dropDown(arg0);
		es.enter_sub_unit_dropdown(arg1);
	}

	@When("user clicks on Submit link")
	public void userClicksOnSubmitLink() {
		es.clickOnSubmit();
	}

	@Given("user is on add Employee page page")
	public void userIsOnAddEmployeePagePage() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");


	}

	@When("user submits first name {string}")
	public void userSubmitsFirstName(String arg0) {
		ap.enterFirstName(arg0);
	}

	@When("user submits middle name {string}")
	public void userSubmitsMiddleName(String arg0) {
		ap.enterMiddleName(arg0);

	}

	@When("user submits last name {string}")
	public void userSubmitsLastName(String arg0) {
		ap.enterLastName(arg0);

	}

	@When("user clicks on Save link")
	public void userClicksOnSaveLink() {
		ap.clickSave();
	}


//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//
//		//home.checkLogoutIsDisplayed();
//		 driver.findElement(By.id("logout")).isDisplayed();
//
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//
//	}




}
