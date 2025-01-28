package com.cts.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.cts.rca.Util.Excelutil;
import com.cts.rca.Util.Utility;
import com.cts.rca.factory.DriverSetupFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class Tests {
    
    WebDriver driver;
    Utility util;
    WebDriverWait wait;
    String baseUrl = "https://www.royalcaribbean.com/alaska-cruises";

    @BeforeClass
    public void setUp() throws Exception {
        driver = DriverSetupFactory.getDriver("chrome");
        driver.manage().window().maximize();
        util = new Utility(driver, baseUrl);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    @Test(priority = 1)
    public void testCloseNotificationBanner() {
        util.clickEvent(util.getWebElement("className", "notification-banner__section-close"));
        // Assuming the notification banner has a specific attribute that disappears
        Assert.assertFalse(util.isDisplayed(util.getWebElement("className", "notification-banner__section-close")), "Banner is still displayed");
    }

    @Test(priority = 2)
    public void testSearchIconVisibility() {
        Assert.assertTrue(util.isDisplayed(util.getWebElement("cssSelector", "[class=\"header__buttonIcon header__buttonIcon__search\"]")), "Search icon is not displayed");
    }

    @Test(priority = 3)
    public void testSearchFunctionality() throws Exception {
        util.clickEvent(util.getWebElement("cssSelector", "[class=\"header__buttonIcon header__buttonIcon__search\"]"));
        util.clickEvent(util.getWebElement("xpath", "//*[@id=\"rciSearchInput\"]"));
        String filepath = "C:\\2375313\\Selenium_learning\\miniproject\\src\\main\\resources\\Book1.xlsx";
        String use = Excelutil.getCellData(filepath,"Sheet1",0,0);
        util.setValues(util.getWebElement("xpath","//*[@id='rciSearchInput']"),use);
        util.clickEvent(util.getWebElement("id","rciSearchInputIcon"));
        Assert.assertTrue(util.isDisplayed(util.getWebElement("linkText","Rhapsody of the Seas | Cruise Ships | Royal Caribbean Cruises")), "Search results are not displayed correctly");
    }

    @Test(priority = 4)
    public void testNavigationToBookNow() throws Exception {
    	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Rhapsody of the Seas | Cruise Ships | Royal Caribbean Cruises"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("BOOK NOW"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=\"date-filter-button\"]")));
        Assert.assertTrue(util.isDisplayed(util.getWebElement("cssSelector", "[data-testid=\"date-filter-button\"]")), "Failed to navigate to BOOK NOW");
    }
    
    @Test(priority = 5)
    public void testDateFilterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid=\"date-filter-button\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=\"see-results-button\"]")));
        Assert.assertTrue(util.isDisplayed(util.getWebElement("cssSelector", "[data-testid=\"see-results-button\"]")), "Failed to open date filter options");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


