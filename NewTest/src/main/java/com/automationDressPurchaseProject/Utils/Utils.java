package com.automationDressPurchaseProject.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class Utils extends TestBase {
	public static int IMPLICIT_WAIT = 10;
	public static int PAGE_LOAD_TIMEOUT = 30;

	public static void takeScreenShotOfFailedTestCase(String nameOfTestCase) {

		// Format the current time in my system
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		// Capturing the screen shot
		File file = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file,
					new File("./FailedScreenShot\\" + "_" + nameOfTestCase + "_" + timeStamp + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void javascriptClick(WebElement element) {
				jse.executeScript("arguments[0].click();", element);
			}
		
		public static void clickOnElement(WebElement element) {
			waitForElementToBeClickable(element, 5).click();
		}
		
		public static WebElement waitForElementToBeClickable(WebElement element, int timeOutInSeconds) {
			return new WebDriverWait(wd, timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public static WebElement waitForElementToBeVisible(WebElement element, int timeOutInSeconds) {
			return new WebDriverWait(wd, timeOutInSeconds).until(ExpectedConditions.visibilityOf(element));
		}
		
		public static Boolean waitForElementToBeSelectable(WebElement element, int timeOutInSeconds) {
			return new WebDriverWait(wd, timeOutInSeconds)
					.until(ExpectedConditions.elementSelectionStateToBe(element, false));
		}
		
		public void switchToFrame(WebElement element) {
			wd.switchTo().frame(waitForElementToBeVisible(element, 5));
		}

	}

