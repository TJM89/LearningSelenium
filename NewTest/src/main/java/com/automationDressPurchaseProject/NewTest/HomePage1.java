package com.automationDressPurchaseProject.NewTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class HomePage1 extends TestBase {

	public HomePage1() {

		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}

	@FindBy(css = "div.header_user_info")
	WebElement clickSignin;

	public LoginPage clickSignInBtn() {
		clickSignin.click();
		return new LoginPage();
	}

}
