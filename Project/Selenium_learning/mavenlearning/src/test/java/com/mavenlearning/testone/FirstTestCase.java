package com.mavenlearning.testone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCase {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		WebElement webElement = driver.findElement(By.linkText("Dropdown"));

		webElement.click();
		webElement = driver.findElement(By.id("dropdown"));

		// webElement=drive.findElement(By.xPath(""));
		Select sel = new Select(webElement);
		List<WebElement> options = sel.getOptions();
		System.out.println(options);
		options.stream().map(w -> w.getText()).forEach(System.out::println);
		

	}

}
