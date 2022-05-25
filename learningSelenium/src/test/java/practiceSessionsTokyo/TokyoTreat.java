package practiceSessionsTokyo;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TokyoTreat {
	
	
	WebDriver wd;
	
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\IT Course\\chrome driver\\chromedriver.exe");

		wd = new ChromeDriver();
			
	}
	
	
		@Test
		public void openPage() {
			wd.get("https://tokyotreat.com/?ad_id=427683916942&wickedsource=google&wickedid=CjwKCAjwp7eUBhBeEiwAZbHwkXH6FZL7lekSpTu-LgVMl6EGV79MIq3Sqb-0OgDf3Lnf-WggTczIIRoCxckQAvD_BwE&wickedid=427683916942&wcid=909942695&wv=4&gclid=CjwKCAjwp7eUBhBeEiwAZbHwkXH6FZL7lekSpTu-LgVMl6EGV79MIq3Sqb-0OgDf3Lnf-WggTczIIRoCxckQAvD_BwE");
			//wd.manage().window().maximize();			
			WebElement findme = wd.findElement(By.cssSelector(".css-1p6is39.exya7ll0"));
			boolean isDisplayed = findme.isDisplayed();
			System.out.println("Is displayed " + isDisplayed);
			findme.click();
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			wd.quit();
			
		}
}