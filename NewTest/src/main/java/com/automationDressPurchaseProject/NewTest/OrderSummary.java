package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;
import com.automationDressPurchaseProject.Utils.Utils;

public class OrderSummary extends TestBase {

	public OrderSummary() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(3);

	}

	@FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")

	WebElement proceedButtonFirst;

	public AddressConfirmationPage proceedFirst() {

		//proceedButtonFirst.click();
		//Using Java script executor click below
		Utils.javascriptClick(proceedButtonFirst);
		return new AddressConfirmationPage();
	}

}
