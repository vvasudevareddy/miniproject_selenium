package com.mavenlearning.testone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com");
        driver.manage().window().maximize();
        /*
         *//*[attr='value']
 
         *
         *
         *
         *
         */
     // WebElement webElement=  driver.findElement(By.xpath("//a[@href='//money.rediff.com/indices']"));
      WebElement webElement=  driver.findElement(By.xpath("//a[contains(text(),'Indices')]"));
      webElement.click();
      
	}

}
