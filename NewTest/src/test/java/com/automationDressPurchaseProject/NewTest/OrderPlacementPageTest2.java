package com.automationDressPurchaseProject.NewTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class OrderPlacementPageTest2 extends TestBase {

	HomePage1 homepage;
	LoginPage loginpage;
	MyAccountPage myAccountPage;
	WomenDressesPage womenDressPage;
	OrderCreationPage orderCreationPage;
	OrderSummary orderSummary;
	AddressConfirmationPage addressConfirmationPage;
	ShippingPage shippingPage;
	PaymentMethodConfirmPage payementConfirmPage;
	FinalOrderConfirmPage finalOrderConfirmPage;
	OrderCompletePage orderCompletePage;

	@BeforeMethod
	public void setUp() {
		intialisation();
		homepage = new HomePage1();

	}

	@Test
	public void verifyUserCanCompleteCheckout() {
		loginpage = homepage.clickSignInBtn();
		loginpage.enterEmail(prop.getProperty("username"));
		loginpage.enterPassword(prop.getProperty("password"));
		myAccountPage = loginpage.clickSignInBtn();
		womenDressPage = myAccountPage.clickWomenTab();
		orderCreationPage = womenDressPage.quickViewClick();
		orderSummary = orderCreationPage.addItemToCart();
		addressConfirmationPage = orderSummary.proceedFirst();
		shippingPage = addressConfirmationPage.secondProceedToCheckOut();
		payementConfirmPage = shippingPage.paymentMethodSelection();
		finalOrderConfirmPage = payementConfirmPage.payByBankWire();
		orderCompletePage = finalOrderConfirmPage.finalOrderConfirmed();

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
