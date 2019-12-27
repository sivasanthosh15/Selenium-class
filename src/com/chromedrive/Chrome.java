package com.chromedrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT\\Downloads\\32-bit_pakage_JAVA\\eclipse\\Selenium class\\Selenium\\Driver File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to get title
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//to find element
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys ("siva");
		
		//to text password
		WebElement txtpassword=driver.findElement (By.name ("pass"));
		txtpassword.sendKeys("123456");
				
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Siva");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murugesan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("123456789");
						
		
		
		//go to Login button
		//WebElement loginBtn= driver.findElement(By.xpath("//input[@type='submit']"));
		//to click login button		
		//loginBtn.click();
		
		
		//to quit the browser
		//driver.quit();*/
	}

}
