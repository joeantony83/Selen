package org.sel1.print;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JOE\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactin.com/HotelApp/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("joe");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("909090");
		WebElement rpass = driver.findElement(By.id("re_password"));
		rpass.sendKeys("909090");
		WebElement name = driver.findElement(By.id("full_name"));
		name.sendKeys("joe");
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("joeantony83@gmail.com");
		WebElement captcha = driver.findElement(By.id("captcha-form"));
		captcha.sendKeys("cognize");
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
	}

}
