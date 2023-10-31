package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookMyShow {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.geckodriver.driver","E:\\Software Testing\\Automation\\Automation Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/header/div[1]/div/div/div/div[2]/div[2]/div[1]"));
		login.click();
		
		WebElement Continue_with_Email = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/div"));
		Continue_with_Email.click();
		
		WebElement Email = driver.findElement(By.id("emailId"));
		Email.sendKeys("autotest@yopmail.com");
		
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/form/div[2]/button"));
		Continue.click();
		
		
		driver.get("https://yopmail.com/");
		
		WebElement Inboxtext = driver.findElement(By.id("login"));
		Inboxtext.sendKeys("autotest@yopmail.com");
		
		WebElement Btn1 = driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[4]/button/i"));
		Btn1.click();
		
	}
}