package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}

	@FindBy(xpath = "//a[contains(text(),'Women')]")
	WebElement clickOnWomenLink;

	public WomenDressesPage clickWomenTab() {
		clickOnWomenLink.click();
		return new WomenDressesPage();

	}

}
