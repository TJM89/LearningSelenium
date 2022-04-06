package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class ShippingPage extends TestBase {

	public ShippingPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(3);

	}

	@FindBy(id = "cgv")
	WebElement checkboxSelection;

	@FindBy(css = "button[type='submit'][class='button btn btn-default standard-checkout button-medium']")
	WebElement paymentMethodSelection;

	public PaymentMethodConfirmPage paymentMethodSelection() {
		checkboxSelection.click();
		paymentMethodSelection.click();
		return new PaymentMethodConfirmPage();

	}

}
