package selenium.core.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAutoSuggestive {

	WebDriver driver;
	String baseURL="https://www.google.com/";
	
	@Test
	public void fontStyleValidation() throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
driver.findElement(By.id("APjFqb")).sendKeys("msys");	

List<WebElement> ele=driver.findElements(By.className("lnnVSe"));

for(WebElement elements : ele) {
	
	if(elements.getText().equalsIgnoreCase("msys2")) {
		elements.click();
		break;
	}
}
}
}
