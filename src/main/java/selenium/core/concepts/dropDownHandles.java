package selenium.core.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dropDownHandles {
	
	WebDriver driver;
	String baseURL="https://www.spicejet.com/";
	
	@Test
	public void fontStyleValidation() throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Agra']")).click();
		
	}

}
