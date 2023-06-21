package selenium.core.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AlertJS {
	
	WebDriver driver;
	String baseURL="https://www.abhibus.com/";
	
	@Test
	public void fontStyleValidation() {

		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		RemoteWebDriver remoteDrive=(RemoteWebDriver) driver;
		//remoteDrive.executeScript("alert('HI')");
		
		String c="document.getElementById('source').value='Wonderful'";
		remoteDrive.executeScript(c);
		
	}
}
