package com.cts.rca.Util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Used to automate the Browser actions
 */
public class Utility {
	WebDriver driver;
	String baseurl;

	// Constructor
	public Utility(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseurl = baseUrl;
		driver.get(baseUrl);
	}

	// Get WebElement based on type
	public WebElement getWebElement(String type, String value) {
		WebElement webElement = null;
		switch (type) {
		case "id":
			webElement = driver.findElement(By.id(value));
			break;
		case "name":
			webElement = driver.findElement(By.name(value));
			break;
		case "cssSelector":
			webElement = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			webElement = driver.findElement(By.xpath(value));
			break;
		case "linkText":
			webElement = driver.findElement(By.linkText(value));
			break;
		case "className":
			webElement = driver.findElement(By.className(value));
			break;
		}
		return webElement;
	}

	public List<WebElement> getWebElementsList(String month) {
		List<WebElement> monthList = driver.findElements(By.xpath(month));
		return monthList;
	}

	// Set values to WebElement
	public void setValues(WebElement webElement, String value) {
		webElement.sendKeys(value);
	}

	// Click WebElement
	public void clickEvent(WebElement webElement) {
		webElement.click();
	}

	// Check if WebElement is displayed
	public boolean isDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}

	// Actions
	public void actionClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	public void selectMonths(List<WebElement> monthList) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		for (int i = 0; i < 4; i++) {
			WebElement month=wait.until(ExpectedConditions.elementToBeClickable(monthList.get(i)));
			actionClick(month);
		}
	}

	// Scroll up, scroll down, and click WebElement using JavaScript
	public void scrollAndClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int scrollAttempts = 0;
		boolean isElementFound = false;

		// Scroll Down
		while (!isElementFound && scrollAttempts < 10) {
			try {
				if (element.isDisplayed()) {
					isElementFound = true;
					break;
				}
			} catch (NoSuchElementException e) {
				js.executeScript("window.scrollBy(0, 250)");
				scrollAttempts++;
			}
		}

		// Scroll Up if not found
		if (!isElementFound) {
			scrollAttempts = 0;
			while (!isElementFound && scrollAttempts < 10) {
				try {
					if (element.isDisplayed()) {
						isElementFound = true;
						break;
					}
				} catch (NoSuchElementException e) {
					js.executeScript("window.scrollBy(0, -250)");
					scrollAttempts++;
				}
			}
		}
		// Click the element if found using JavaScript
		if (isElementFound) {
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			js.executeScript("arguments[0].click();", element);
		} else {
			System.out.println("Element not found after scrolling.");
		}
	}

	public void dropdownSelect(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -1000);");
		actionClick(element);

	}
	public void closeBrowser()
	{
		driver.quit();
	}

}
