package NaveenAutomation.purchasingAProduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class productPurchaseTesting {

	WebDriver wd;
	WebDriverWait wait;
	Actions action;
	JavascriptExecutor js;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\IT Course\\chrome driver\\chromedriver.exe");

		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		wd.manage().window().maximize();
	}

	@Test
	public void buyingAnItem() {

		WebElement phonesLink = wd.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]"));
		phonesLink.click();

		WebElement addToCart = wd.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
		addToCart.click();

		WebElement checkOutTop = wd.findElement(By.xpath("//span[contains(text(),'Checkout')]"));
		checkOutTop.click();

		WebElement guest = wd.findElement(By.cssSelector("input[value='guest']"));
		guest.click();

		WebElement continueSelect = wd.findElement(By.cssSelector("input[value='Continue']"));
		continueSelect.click();

		WebElement firstName = wd.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys("Thomas");

		WebElement lastName = wd.findElement(By.cssSelector("input[name='lastname']"));
		lastName.sendKeys("Jacob");

		WebElement email = wd.findElement(By.id("input-payment-email"));
		email.sendKeys("tj.123@ymail.com");

		WebElement phone = wd.findElement(By.cssSelector("input[name='telephone']"));
		phone.sendKeys("859684568");

		WebElement address1 = wd.findElement(By.cssSelector("input[name='address_1']"));
		address1.sendKeys("MarkStreet");

		WebElement address2 = wd.findElement(By.cssSelector("input[name='address_2']"));
		address2.sendKeys("Apartment 22");

		WebElement city = wd.findElement(By.cssSelector("input[name='city']"));
		city.sendKeys("Toronto");

		WebElement postc = wd.findElement(By.cssSelector("input[name='postcode']"));
		postc.sendKeys("UYYV");

		WebElement country = wd.findElement(By.cssSelector("select[name='country_id']"));
		country.sendKeys("Iceland");

		WebElement state = wd.findElement(By.xpath("//option[contains(text(),'Austurland')]"));
		state.click();

		WebElement confirmAddress = wd.findElement(By.cssSelector("input[name='shipping_address']"));
		confirmAddress.isSelected();

		WebElement continueAgain = wd.findElement(By.id("button-guest"));
		continueAgain.click();

		WebElement shippingRateCheck = wd.findElement(By.cssSelector("input[name='shipping_method']"));
		shippingRateCheck.click();

		WebElement continueOnceAgain = wd.findElement(By.id("button-shipping-method"));
		continueOnceAgain.click();

		WebElement paymentCODCheck = wd.findElement(By.cssSelector("input[name='payment_method']"));
		paymentCODCheck.click();

		WebElement agree = wd.findElement(By.cssSelector("input[name='agree']"));
		agree.click();

		WebElement continueAgain3 = wd.findElement(By.id("button-payment-method"));
		continueAgain3.click();

		WebElement confirmOrder = wd.findElement(By.cssSelector("input[id='button-confirm']"));
		confirmOrder.click();

	}

	
	  @AfterMethod 
	  public void quitSession(){ 
		  wd.quit(); 
	  }
	 
}
