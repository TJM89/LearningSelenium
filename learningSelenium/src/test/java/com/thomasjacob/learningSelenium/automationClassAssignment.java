package com.thomasjacob.learningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automationClassAssignment {

	WebDriver wd;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\class\\testNG\\Chrome\\chromedriver.exe");

		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		wd.manage().window().maximize();
	}

	@Test
	public void registerAccount() {

		WebElement email = wd.findElement(By.id("email_create"));
		email.sendKeys("tj.extremez@pmail.com");

		WebElement createAccount = wd.findElement(By.id("SubmitCreate"));
		createAccount.submit();

		wd.findElement(By.cssSelector("label[for='id_gender1']")).click();
		// WebElement selectGender = wd.findElement(By.className("radio"));

		WebElement cxName = wd.findElement(By.cssSelector("input[name='customer_firstname']"));
		// cxName.sendKeys("Thomas");

		WebElement cxLastName = wd.findElement(By.cssSelector("input[name='customer_lastname']"));
		// cxLastName.sendKeys("Jacob");

		WebElement password = wd.findElement(By.cssSelector("input[name='passwd']"));
		password.sendKeys("Password");

		WebElement days = wd.findElement(By.id("days"));
		days.sendKeys("11");

		WebElement months = wd.findElement(By.id("months"));
		months.sendKeys("March");

		WebElement years = wd.findElement(By.id("years"));
		years.sendKeys("2021");

		WebElement cxName1 = wd.findElement(By.cssSelector("input[name='customer_firstname']"));
		cxName1.sendKeys("Thomas");

		WebElement cxLastName1 = wd.findElement(By.cssSelector("input[name='customer_lastname']"));
		cxLastName1.sendKeys("Jacob");

		WebElement company = wd.findElement(By.cssSelector("input[name='company']"));
		company.sendKeys("EY");

		WebElement address = wd.findElement(By.cssSelector("input[name='address1']"));
		address.sendKeys("York street lane no 15");

		WebElement address2 = wd.findElement(By.cssSelector("input[name='address2']"));
		address2.sendKeys("North York");

		WebElement city = wd.findElement(By.cssSelector("input[name='city']"));
		city.sendKeys("Toronto");

		WebElement state = wd.findElement(By.id("id_state"));
		state.sendKeys("Alaska");

		WebElement postcde = wd.findElement(By.cssSelector("input[name='postcode']"));
		postcde.sendKeys("58996");

		/*
		 * WebElement country =
		 * wd.findElement(By.cssSelector("input[name='id_country']"));
		 * country.sendKeys("United States");
		 */

		WebElement additionalInfo = wd.findElement(By.cssSelector("textarea[name='other']"));
		additionalInfo.sendKeys("No additional info.");

		WebElement mobilePhone = wd.findElement(By.id("phone_mobile"));
		mobilePhone.sendKeys("458965986");

		WebElement registerAccount = wd.findElement(By.cssSelector("button[name='submitAccount']"));

		registerAccount.submit();

	}

}
