package com.chromedrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop  {
		public static void main (String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\Downloads\\32-bit_pakage_JAVA\\eclipse\\Selenium class\\Selenium\\Driver File\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement destin = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(source,destin).perform();
	
}}