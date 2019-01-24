package org.sel1.print;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/index.html");
		Thread.sleep(1000);
		WebElement omr = driver.findElement(By.xpath("//div[@class='trainer-info'][2]"));
		String text = omr.getText();
		System.out.println(text);
		driver.quit();
	}

}
