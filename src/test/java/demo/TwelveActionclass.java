package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwelveActionclass {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.amazon.in/");
	//driver.manage().window().maximize();
	
//Mouse Hover in amazon page
//	  WebElement arrow = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
//	  Actions act = new Actions(driver);
//	  act.moveToElement(arrow).perform();
//	
//	  WebElement orders = driver.findElement(By.linkText("Your Orders"));
//	  act.moveToElement(orders).click().perform();
	  
	
//Mouse Hover in flipkart page
	
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  
	  WebElement flipkartlogin = driver.findElement(By.linkText("Login"));
	  Actions act = new Actions(driver);
	  act.moveToElement(flipkartlogin).perform();
	  Thread.sleep(3000);
	  
	  WebElement profile = driver.findElement(By.linkText("My Profile"));
	  act.moveToElement(profile).click().perform();
	  
	  
}}
