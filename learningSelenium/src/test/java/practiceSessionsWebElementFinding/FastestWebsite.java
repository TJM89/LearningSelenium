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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FastestWebsite {
	
	WebDriver wd;
	Action act;
	WebDriverWait wait;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\IT Course\\chrome driver\\chromedriver.exe");
		wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(wd, 10);

	}
	
	
	@Test
	public void TestSpeed() {
		
	wd.get("https://robinjescott.com/about/");	
	WebElement element = wd.findElement(By.id("menu-item-166"));
	element.click();
	
	WebElement element2 = wd.findElement(By.xpath("//a[text()='relevant page']"));
	wait.until(ExpectedConditions.visibilityOf(element2));
	element2.click();
	
	
	wd.navigate().refresh();
	wd.navigate().back();
			
	}
	@AfterMethod

	private void quit() {
	 wd.quit();	
		
		
		
	}
	}
	
	