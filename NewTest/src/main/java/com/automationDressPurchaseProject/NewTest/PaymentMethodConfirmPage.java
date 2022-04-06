package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class PaymentMethodConfirmPage extends TestBase {

	public PaymentMethodConfirmPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(3);

	}

	@FindBy(css = "div [class = 'bankwire']")
	WebElement payByBankWire;

	public FinalOrderConfirmPage payByBankWire() {
		payByBankWire.click();

		return new FinalOrderConfirmPage();
	}

}
