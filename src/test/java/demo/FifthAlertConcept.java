package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthAlertConcept {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
//		1.using accept for only ok button
		WebElement simplealert= driver.findElement(By.id("accept"));
	    simplealert.click();
	    Thread.sleep(3000);
	    
	    Alert simplealer = driver.switchTo().alert();
	    Thread.sleep(3000);
	    simplealer.accept();

//     2.using dismiss for if there is a ok and cancel button	    
	    WebElement confirmalert= driver.findElement(By.id("confirm"));
	    confirmalert.click();
	    Thread.sleep(3000);
	    
	    Alert confirmaler = driver.switchTo().alert();
	    Thread.sleep(3000);
	    confirmaler.dismiss();
		
//	    3.using accept because after enter we have to click ok ,ok means accept
	    WebElement promptalert= driver.findElement(By.id("prompt"));
	    promptalert.click();
	    Thread.sleep(3000);
	    
	    Alert promptaler = driver.switchTo().alert();
	    promptaler.sendKeys("Suba");
	    promptaler.accept();
	    
	    
	    
		WebElement modernalert= driver.findElement(By.id("modern"));
	    modernalert.click();
	    
	    WebElement cancel= driver.findElement(By.xpath("/html/body/app-root/app-alert/section/div/div/div[1]/div/div/div[5]/button"));
	    Thread.sleep(3000);
	    cancel.click();
	    System.out.println("Modern alert closed successfully");
	   
	    
	        
	    
}}

