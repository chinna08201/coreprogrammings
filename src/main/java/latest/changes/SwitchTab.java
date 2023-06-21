package latest.changes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SwitchTab {
	
	
	
	WebDriver driver;
	String baseURL="https://www.abhibus.com/";
	@Test
	public void scrollToBottomJavaScripts() {
		
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	Set<String> hangles=	driver.getWindowHandles();
	
	Iterator<String> iterator=hangles.iterator();
	
	String parentWindow=iterator.next();
	String childWindow=iterator.next();
	
	
	driver.switchTo().window(childWindow);
	
	driver.navigate().to("https://online.tirupatibalaji.ap.gov.in/home/dashboard");
	
	driver.switchTo().window(parentWindow);
	
	RemoteWebDriver remoteDrive=(RemoteWebDriver) driver;
	//remoteDrive.executeScript("alert('HI')");
	
	String c="document.getElementById('source').value='Wonderful'";
	remoteDrive.executeScript(c);
	
	String d="document.getElementById('destination').value='HelloUser'";
	remoteDrive.executeScript(d);
	
	
	driver.switchTo().window(childWindow);
	
	//driver.findElement(By.linkText("SVBC")).click();
	
	//driver.findElements(By.cssSelector("div[class='login_dialogMobileBody__1Dsf9'] div input")).get(1).sendKeys("123333333333333");
	
	
	
	driver.switchTo().window(parentWindow);
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	
	//driver.close();
	
		
	}

}
