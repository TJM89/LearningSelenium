package buyingDressAssignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyingDress {
	WebDriver wdriver;
	WebDriverWait wait;
	Actions action;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\class\\testNG\\Chrome\\chromedriver.exe");

		wdriver = new ChromeDriver();
		wdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wdriver.get("http://automationpractice.com/index.php?controller=authentication&back=history");
		wdriver.manage().window().maximize();
	}

	@Test
	public void buyingADress() {

		WebElement email = wdriver.findElement(By.id("email"));
		email.sendKeys("tj.extremez@gpomail.com");
		WebElement password = wdriver.findElement(By.id("passwd"));
		password.sendKeys("Password");

		wdriver.findElement(By.id("SubmitLogin")).click();
		WebElement nameConfirmation = wdriver.findElement(By.cssSelector("div [class = 'account'][title='View my customer account']"));
		String userName = nameConfirmation.getText();
		Assert.assertEquals(userName, "Thomas Jacob", "Username verified");

		action = new Actions(wdriver);
		WebElement clickWomenTab = wdriver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		action.click(clickWomenTab).perform();

		WebElement quickview = wdriver.findElement(By.cssSelector("div [class = 'product-image-container']"));
		quickview.click();

		wdriver.switchTo().frame(0);

		WebElement qty = wdriver
				.findElement(By.cssSelector("div [class = 'btn btn-default button-plus product_quantity_up']"));
		action.click(qty).perform();

		WebElement size = wdriver.findElement(By.id("group_1"));
		size.sendKeys("L");

		wdriver.findElement(By.id("add_to_cart")).submit();

		WebElement getPriceConfirmed = wdriver.findElement(By.id("total_price"));
		String actualPrice = getPriceConfirmed.getText();
		Assert.assertEquals(actualPrice, "$35.02", "Total price has been confirmed");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement proceed = wdriver
				.findElement(By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium"));
		proceed.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement message = wdriver.findElement(By.cssSelector("textarea[name='message']"));
		message.sendKeys("Please call the phone number provided at time of delivery");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement proceedFurther = wdriver
				.findElement(By.cssSelector("button[type='submit'][class='button btn btn-default button-medium']"));
		proceedFurther.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement checkBox = wdriver.findElement(By.id("cgv"));
		checkBox.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement proceedAgain = wdriver.findElement(By
				.cssSelector("button[type='submit'][class='button btn btn-default standard-checkout button-medium']"));
		proceedAgain.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement paymentMode = wdriver.findElement(By.cssSelector("div [class = 'bankwire']"));
		paymentMode.click();
		WebElement getTheContent = wdriver.findElement(By.cssSelector("div [class = 'page-subheading']"));
		String actualTextMessage = getTheContent.getText();
		Assert.assertEquals(actualTextMessage, "BANK-WIRE PAYMENT.", "Bank Payment confirmation");

		WebElement confirmOrder = wdriver
				.findElement(By.cssSelector("button[type='submit'][class='button btn btn-default button-medium']"));
		confirmOrder.click();
		WebElement getTextContent = wdriver.findElement(By.cssSelector("div [class = 'cheque-indent']"));
		String actualText = getTextContent.getText();
		Assert.assertEquals(actualText, "Your order on My Store is complete.", "Order placement complete");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterMethod

	public void tearDown() {
		wdriver.quit();
	}

}