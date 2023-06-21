package selenium.core.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class HrefTags {

	WebDriver driver;
	String baseURL = "https://www.abhibus.com/";

	@Test
	public void findingOutHrefTagURLs() {

		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();

		List<WebElement> elements = driver.findElements(By.xpath("//a"));

		for (WebElement ele : elements) {
			String Url = ele.getAttribute("href");
			System.out.println(Url);
		}
	}

}
