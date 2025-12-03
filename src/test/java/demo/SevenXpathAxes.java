package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SevenXpathAxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 
WebElement tvsAppliances = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
               tvsAppliances.click();
          
            Thread.sleep(2000);
            driver.navigate().back();
  
 WebElement mobilesTablets = driver.findElement(By.xpath("//span[text()='TVs & Appliances']//preceding::span[text()='Mobiles & Tablets']"));
           
            Thread.sleep(3000);
            mobilesTablets.click();
        

     
            
	}}

       
		 
		 
		 


