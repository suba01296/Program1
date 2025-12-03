
package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstLocators {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
	    gmail.click();
	   
		List<WebElement> tags = driver.findElements(By.tagName("div"));
		System.out.println(tags.size());
	
		WebElement textbox = driver.findElement(By.id("APjFqb"));
		textbox.sendKeys("Flowers");
		textbox.sendKeys(Keys.ENTER);
		 
		WebElement textbox2= driver.findElement(By.name("q"));
		textbox.sendKeys("India");
		textbox.sendKeys(Keys.ENTER);
		
		WebElement textbox3 = driver.findElement(By.className("gLFyf"));
		textbox.sendKeys("Guitars");
		textbox.sendKeys(Keys.ENTER);
		
		WebElement store = driver.findElement(By.partialLinkText("re"));
		store.click();
	
	
}}
