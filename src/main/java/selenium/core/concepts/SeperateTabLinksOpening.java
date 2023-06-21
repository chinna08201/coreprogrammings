package selenium.core.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeperateTabLinksOpening {

	WebDriver driver;
	String baseURL="https://www.spicejet.com/";
	
	@Test
	public void fontStyleValidation() throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		RemoteWebDriver remot= (RemoteWebDriver) driver;
		String c	="window.scrollTo(0,document.body.scrollHeight)";
			remot.executeScript (c);
			
			
			
		//WebElement element=	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-1x0uki6'])[2]"));
		
}
}
