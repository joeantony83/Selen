package org.sel1.print;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clik {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//input[@id='u_0_8']"));	
	btn.click();
		
	}

}
