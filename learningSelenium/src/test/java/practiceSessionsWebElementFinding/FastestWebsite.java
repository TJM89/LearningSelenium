package practiceSessionsWebElementFinding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FastestWebsite {
	
	WebDriver wd;
	Action act;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\IT Course\\chrome driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	@Test
	public void TestSpeed() {
		
	wd.get("https://robinjescott.com/about/");	
	WebElement element = wd.findElement(By.id("menu-item-166"));
	element.click();
	WebElement element2 = wd.findElement(By.xpath("//a[text()='relevant page']"));
	element2.click();	
			
	}
	@AfterMethod

	private void quit() {
		wd.quit();	
		
		
		
	}
	}
	
	