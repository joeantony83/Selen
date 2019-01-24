package org.sel1.print;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static void main(String[] args) throws Throwable 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/automation-practice-form/");
			Thread.sleep(1000);
			WebElement month = driver.findElement(By.id("selenium_commands"));
			Select s=new Select(month);
			s.selectByIndex(1); 
			s.selectByIndex(2);
			s.selectByIndex(2);
		}

	}


