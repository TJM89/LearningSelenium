package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class AddressConfirmationPage extends TestBase {

	public AddressConfirmationPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(2);
	}

	@FindBy(css = "button[type='submit'][class='button btn btn-default button-medium']")
	WebElement secondProceedToCheckOut;

	public ShippingPage secondProceedToCheckOut() {
		secondProceedToCheckOut.click();
		return new ShippingPage();
	}

}
