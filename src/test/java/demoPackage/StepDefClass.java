package demoPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilityPackage.BaseClass;
import utilityPackage.PropertyFileRead;

public class StepDefClass {
	
	static WebDriver driver;
	
	BaseClass n=null;
	
	@Given("navigate to the url {string}")
	public void navigate_to_the_url(String url) {
	    
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
	}

	@When("enter the userId {string} and {string}")
	public void enter_the_userId_and(String user, String pass, DataTable table) {
		
		n=new BaseClass(driver);
		
		List<String> l=table.asList();
		
		WebElement userName=n.locator(PropertyFileRead.read(user));
		userName.sendKeys(l.get(0));
		WebElement password=n.locator(PropertyFileRead.read(pass));
		password.sendKeys(l.get(1)); 
	}

	@Then("click login {string}")
	public void click_login(String lgn) {
		
		n=new BaseClass(driver);
	    
		WebElement loginbuton=n.locator(PropertyFileRead.read(lgn));
		loginbuton.click();
		
	}
	
}