package latest.changes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	WebDriver driver;
	String baseURL="https://www.abhibus.com/";
	@Test
	public void scrollToBottomJavaScripts() throws IOException, InterruptedException {
		
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		
		WebElement dest=driver.findElement(By.id("destination"));
		
		dest.sendKeys("MahasriSaiChandanaKumarYadav");
		
		File file=dest.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:\\Downloads\\automation\\sample\\Screenshots\\textBox.png"));
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
