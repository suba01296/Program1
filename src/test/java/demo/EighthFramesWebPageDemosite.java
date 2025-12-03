package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EighthFramesWebPageDemosite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		

//using frames(singleframe)
		
	     driver.switchTo().frame("singleframe");  //switching frame using id
	     driver.switchTo().frame(0);             //switching frame using index
		 WebElement iframe = driver.findElement(By.id("singleframe"));//switching frame using web element
		 driver.switchTo().frame(iframe); 
		
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
        inputbox.sendKeys("Output1");
		
		
//using	frames(multiple frames)
        
		Thread.sleep(2000);
        WebElement secondframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		secondframe.click();
		
		//using web element
		WebElement nestedframe  = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(nestedframe);
		
		WebElement iframeDemo  = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(iframeDemo);
        
          //using index
        driver.switchTo().frame(1); // outer frame
        driver.switchTo().frame(0); // inner frame
        
        
		WebElement inputbox2 = driver.findElement(By.xpath("//input[@type='text']"));
        inputbox2.sendKeys("Output2");
        
        
}}


