package com.cts.rca;

import org.openqa.selenium.WebDriver;

import com.cts.rca.Util.Excelutil;
import com.cts.rca.Util.Utility;
import com.cts.rca.factory.DriverSetupFactory;

public class Main {
	
		public static void main(String[] args) throws Exception {
			
			WebDriver driver=DriverSetupFactory.getDriver("chrome");
			driver.manage().window().maximize();
			String baseUrl="https://www.royalcaribbean.com/alaska-cruises";
			
		
			Utility util=new Utility(driver,baseUrl);
			
			util.clickEvent(util.getWebElement("className", "notification-banner__section-close"));
			
			System.out.println(util.isDisplayed(util.getWebElement("cssSelector","[class=\"page destination-template md-theme-default\"]")));
			
			util.clickEvent(util.getWebElement("cssSelector", "[class=\"header__buttonIcon header__buttonIcon__search\"]"));
			
			util.clickEvent(util.getWebElement("className","header__buttonIcon"));
			
		    util.clickEvent(util.getWebElement("xpath", "//*[@id=\"rciSearchInput\"]"));
		    
		    String filepath="C:\\2375313\\Selenium_learning\\miniproject\\src\\main\\resources\\Book1.xlsx";
			String use=Excelutil.getCellData(filepath,"Sheet1",0,0);
			
			util.setValues(util.getWebElement("xpath","//*[@id='rciSearchInput']"),use);

		    util.clickEvent(util.getWebElement("id","rciSearchInputIcon"));
			
			util.clickEvent(util.getWebElement("linkText","Rhapsody of the Seas | Cruise Ships | Royal Caribbean Cruises"));
			
		    util.clickEvent(util.getWebElement("linkText","BOOK NOW"));
			
		    util.clickEvent(util.getWebElement("cssSelector", "[data-testid=\"date-filter-button\"]"));
		    
		    util.selectMonths(util.getWebElementsList("//*[contains(@class,'bMGRrT')]"));
	        
		    util.scrollAndClick(driver, util.getWebElement("cssSelector", "[data-testid='destination-filter-button']"));
			
		    util.scrollAndClick(driver, util.getWebElement("id","destination-card-label-CARIB"));
			
		    util.scrollAndClick(driver, util.getWebElement("cssSelector","[data-testid='departure-port-filter-button']"));
			
		    util.scrollAndClick(driver, util.getWebElement("id","departure-port-label-SJU"));
			
		    util.scrollAndClick(driver, util.getWebElement("cssSelector","[data-testid='number-of-nights-filter-button']"));
		    
			util.scrollAndClick(driver, util.getWebElement("xpath", "//button[normalize-space()='6 - 8']"));
			
			util.clickEvent(util.getWebElement("cssSelector", "[data-testid=\"see-results-button\"]"));

			util.dropdownSelect(util.getWebElement("cssSelector", "[data-testid=\"sort-by-results-dropdown\"]"));
			
			util.clickEvent(util.getWebElement("xpath", "//*[@id=\"results-dropdown-sort\"]/div[2]/div/div/div/ul/li[2]/p"));
			
			System.out.println(util.getWebElement("xpath", "//div[@data-testid='number-results-label']//span[1]/child::*[2]").getText().substring(1,2));
			
			util.closeBrowser();
		}



}
