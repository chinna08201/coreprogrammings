package selenium.core.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FontSizeValidation {
	
	/**
	 * Store the element using getCSS in the webElement
	 */
	
	WebDriver driver;
	String baseURL="https://www.abhibus.com/";
	@Test
	public void fontStyleValidation() {
		
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
	WebElement sourceTextField=	driver.findElement(By.xpath("//input[@id='source']"));
	String fontSize=sourceTextField.getCssValue("font-size");
	System.out.println(fontSize);
	
	driver.navigate().refresh();
	sourceTextField.sendKeys(Keys.ARROW_DOWN);
	sourceTextField.sendKeys(Keys.ARROW_DOWN);
	sourceTextField.sendKeys(Keys.ENTER);
	sourceTextField.sendKeys(Keys.CONTROL+"c");
	
	//Get the Font COlor
	System.out.println(driver.findElement(By.xpath("//input[@id='source']")).getCssValue("color"));
		
		driver.close();
	}

}
