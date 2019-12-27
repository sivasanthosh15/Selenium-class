package com.chromedrive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT\\Downloads\\32-bit_pakage_JAVA\\eclipse\\Selenium class\\Selenium\\Driver File\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		System.out.println(iTable.size());
		WebElement table = iTable.get(0);
		List<WebElement> iRow = driver.findElements(By.tagName("tr"));
		System.out.println(iRow.size());
		WebElement row = iRow.get(2);
		List<WebElement> iData = driver.findElements(By.tagName("td"));
		System.out.println(iData.size());
		
		for(int i=0;i<iData.size(); i++ )  {
			WebElement data = iData.get(i);
			String text = data.getText();
			System.out.println(text);
			
			
		}
		
		
		
		
	}

}
