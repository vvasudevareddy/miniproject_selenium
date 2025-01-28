package com.mavenlearning.testone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("@//input[@name='search' or @placeholder='xyz']")).sendKeys("T-shirts");
		
		
	}

}
