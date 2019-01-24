package org.sel1.print;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("9840561104");
		String text = username.getAttribute("value");
		System.out.println(text);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("16qdqwdwd4");
		String text2 = pass.getAttribute("value");
		System.out.println(text2);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
