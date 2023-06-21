package selenium.core.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ScrollToBottomUsingJS {
	
	
	WebDriver driver;
	String baseURL="https://www.abhibus.com/";
	@Test
	public void scrollToBottomJavaScripts() {
		
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		RemoteWebDriver remot= (RemoteWebDriver) driver;
	String c	="window.scrollTo(0,document.body.scrollHeight)";
		remot.executeScript (c);
	}
}
