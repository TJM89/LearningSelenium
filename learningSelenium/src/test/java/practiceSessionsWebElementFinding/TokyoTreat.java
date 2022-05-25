package practiceSessionsWebElementFinding;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TokyoTreat {

	WebDriver wd;
	WebDriverWait wait;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\IT Course\\chrome driver\\chromedriver.exe");
		wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(wd, 10);

	}

	@Test
	public void openPage() {
		wd.get("https://tokyotreat.com/?ad_id=427683916942&wickedsource=google&wickedid=CjwKCAjwp7eUBhBeEiwAZbHwkXH6FZL7lekSpTu-LgVMl6EGV79MIq3Sqb-0OgDf3Lnf-WggTczIIRoCxckQAvD_BwE&wickedid=427683916942&wcid=909942695&wv=4&gclid=CjwKCAjwp7eUBhBeEiwAZbHwkXH6FZL7lekSpTu-LgVMl6EGV79MIq3Sqb-0OgDf3Lnf-WggTczIIRoCxckQAvD_BwE");
		// wd.manage().window().maximize();
		WebElement findme = wd.findElement(By.cssSelector(".css-1p6is39.exya7ll0"));
		wait.until(ExpectedConditions.visibilityOf(findme));
		boolean isDisplayed = findme.isDisplayed();
		System.out.println("Is displayed " + isDisplayed);

		findme.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod

	private void quit() {
		wd.quit();

	}
}