package utilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	WebDriver driver;
	static WebElement element;
	
	public BaseClass(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public WebElement locator(String value) {
		
		WebElement element = driver.findElement(By.name(value));
		
		return element;
		
	}

}
