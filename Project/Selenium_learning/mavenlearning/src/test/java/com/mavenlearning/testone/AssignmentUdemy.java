package com.mavenlearning.testone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentUdemy {
	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		List<WebElement> linksCount=driver.findElements(By.tagName("a"));
		List<WebElement> imagesCount=driver.findElements(By.tagName("img"));
		System.out.println(linksCount.size());
		System.out.println(imagesCount.size());
		
		driver.findElement(By.partialLinkText("Cart")).click();
		
	}

}
