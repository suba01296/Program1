package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirteenKeyboardActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));		
		
		Actions act = new Actions(driver);
		
//1. send the text to email box as Suba@gmail.com	
		act.sendKeys(email, "suba@gmail.com").perform();
//2.select the text, ctrl + a
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//3.copy the text, ctrl + c		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//4. TO move to the password field
		act.sendKeys(Keys.TAB).perform();
//5.paste the text, ctrl + v		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();	
//6. two tabs, and then press enter		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
						
}}
