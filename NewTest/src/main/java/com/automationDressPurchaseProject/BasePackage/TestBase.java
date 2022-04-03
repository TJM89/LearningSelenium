package com.automationDressPurchaseProject.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
	public static Properties prop;

	public TestBase() {
		try {
			prop =new Properties();
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\Thomas\\eclipse-workspace\\NewTest\\src\\main\\java\\com\\automationDressPurchaseProject\\config\\configuration.properties");

			prop.load(fs);

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void intialisation() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
			break;

		default:
			System.out.println("*This is not a correct browser name*");
			break;
		}
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		wd.get(prop.getProperty("URL"));
		 

	}
	public void tearDown() {
		wd.quit();
	}
}
