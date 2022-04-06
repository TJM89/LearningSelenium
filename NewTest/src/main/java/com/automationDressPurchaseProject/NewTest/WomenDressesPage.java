package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class WomenDressesPage extends TestBase {

	public WomenDressesPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(10);

	}

	@FindBy(css = "div [class = 'product-image-container']")
	WebElement clickOnProduct;

	public OrderCreationPage quickViewClick() {

		clickOnProduct.click();
		wd.switchTo().frame(0);

		return new OrderCreationPage();
	}

}
