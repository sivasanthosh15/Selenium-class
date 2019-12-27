package com.chromedrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT\\Downloads\\32-bit_pakage_JAVA\\eclipse\\Selenium class\\Selenium\\Driver File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		try {
			WebElement closeBtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
			closeBtn.click();
		}
		catch(Exception e) {
			e.printStackTrace();		
	
		}
		
		
		WebElement menShop = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(menShop).perform();
						
	}
}
