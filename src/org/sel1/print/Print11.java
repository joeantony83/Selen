package org.sel1.print;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='x']")).click();
		WebElement tes=driver.findElement(By.xpath("//a[text('TESTIMONIALS']"));
		tes.click();
		WebElement para = driver.findElement(By.xpath("//div[@id='article-wrapper']"));
		String text = para.getText();
		System.out.println(text);
	}

}

