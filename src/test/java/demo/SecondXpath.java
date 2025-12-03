package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		
                         //relative xpath
		
//1.Using attribute name and attribute value		
WebElement fbemail = driver.findElement(By.xpath("//input[@data-testid='royal-email']"));	    
fbemail.sendKeys("suba@gmail.com");

//2.using contains methodp
WebElement fbpassword = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
fbpassword.sendKeys("1234");
	
//3.OR operator
WebElement fblogin = driver.findElement(By.xpath("//button[@value='1' or  @id='u_0_0_eS']"));
fblogin.click();
	
//4.Using text() method	
WebElement frgtpaswrd = driver.findElement(By.xpath(" //a[text()='Forgotten password?']"));	
frgtpaswrd.click();	
	
//5.AND operator
WebElement createnewacc = driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']"));
createnewacc.click();

//6.Starts-with() method
WebElement fbhighlight = driver.findElement(By.xpath("//img[starts-with(@alt,'Facebook')]"));
System.out.println(fbhighlight);
	

		               //absolute xpath
		
WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
email.sendKeys("xyz@gmail.com");

WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
password.sendKeys("abcd");
			    
WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
login.click(); 
			    		
	}}
