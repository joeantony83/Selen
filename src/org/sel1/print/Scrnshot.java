package org.sel1.print;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrnshot {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\seleniumNew\\SeleniumDay3\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		Thread.sleep(900);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement st = driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		js.executeScript("arguments[0].scrollIntoView(true)", st);
		  
	
	}

}
