package selenium.core.concepts;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWaitsExple {

	// https://the-internet.herokuapp.com/dynamic_loading/1

	WebDriver driver;
	String baseURL = "https://the-internet.herokuapp.com/dynamic_loading/1";

	@Test
	public void fontStyleValidation() throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
	/*
	 * FluentWait, WebdriverWait are the classes are available in Wait interface.
	 * 
	 */
		
	Wait<WebDriver> wait=	new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40)).pollingEvery(Duration.ofSeconds(3));
		
	wait.until(new Function<WebDriver, WebElement>() {
		
		
		public WebElement apply(WebDriver driver) {
			
			if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
				
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			} else {
					return null;
			}
			
		}
	});
		
	
	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	driver.quit();
	
}
}
