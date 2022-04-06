package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class OrderCreationPage extends TestBase {

	public OrderCreationPage() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(3);

	}

	@FindBy(id = "add_to_cart")

	WebElement addItem;

	public OrderSummary addItemToCart() {

		addItem.submit();
		return new OrderSummary();
	}

}
