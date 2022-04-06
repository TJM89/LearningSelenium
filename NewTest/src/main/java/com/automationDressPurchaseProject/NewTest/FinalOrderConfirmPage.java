package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class FinalOrderConfirmPage extends TestBase {

	public FinalOrderConfirmPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}

	@FindBy(css = "button[type='submit'][class='button btn btn-default button-medium']")
	WebElement finalOrderConfirmed;

	public OrderCompletePage finalOrderConfirmed() {
		finalOrderConfirmed.click();

		return new OrderCompletePage();

	}

}
