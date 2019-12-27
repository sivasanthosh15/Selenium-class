package com.chromedrive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT\\Downloads\\32-bit_pakage_JAVA\\eclipse\\Selenium class\\Selenium\\Driver File\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://paytm.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		//int sizee=finElementss. Size();
		//System.out.println(sizee);
		//Thread.Steep(3000);
		driver.findElement(By.xpath("//canvas[@class='qrcode']")).click();
		List<WebElement> findElements2 = driver.findElements(By.xpath("iframe"));
		int sizee=findElements2.size();
		System.out.println(sizee);		
		
		
			
	}

}
