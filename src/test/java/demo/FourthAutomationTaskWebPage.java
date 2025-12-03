package demo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FourthAutomationTaskWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Suba P");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("suba@gmail.com");
		

		WebElement number= driver.findElement(By.id("phone"));
		number.sendKeys("0123456789");
		
		
		WebElement address= driver.findElement(By.id("textarea"));
		address.sendKeys("Chennai");
		
		
//Using is Selected for radio button Male and Female 
		
		WebElement male = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div[1]/input"));
		male.click();
		boolean maleclick = male.isSelected();
		System.out.println("Mselect:"   + maleclick);
		
		 
		WebElement female = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div[2]/input"));
		female.click();
		boolean femaleclick = female.isSelected();
		System.out.println("Fselect:"  + femaleclick );

		System.out.println("-----------------------");
	
//Using  Single DropDown		
		
		WebElement singledropdown = driver.findElement(By.id("country"));
		Select s = new Select(singledropdown);
		
		s.selectByIndex(1);
		s.selectByValue("india");
		s.selectByVisibleText("Canada");
		
		List<WebElement> alloptions = s.getOptions();  //get all options belongs to select class ,return list<webelement>
		
		for(WebElement opt : alloptions) {
			System.out.println("All Select:"  +opt.getText());  //get text of each it belongs to webelement,will return string
		}
		
		System.out.println("-----------------------");
		
//Using Multiple DropDown	
		WebElement multipledropdown = driver.findElement(By.id("colors"));
	    Select m = new Select(multipledropdown);
		
		m.selectByValue("yellow");
		m.selectByIndex(5);
		m.selectByVisibleText("Blue");
		
		WebElement firstSelectedOption = m.getFirstSelectedOption();
		System.out.println("First Select:"   +firstSelectedOption.getText());
		System.out.println("-----------------------");
		
		List<WebElement> allSelectedOptions = m.getAllSelectedOptions();
		
		for(WebElement opt : allSelectedOptions) {
			System.out.println("Selectoptions:"   +opt.getText());
		}
		
		m.deselectAll();
	    m.deselectByIndex(3);
		m.deselectByValue("red");
     	m.deselectByVisibleText("Blue");
     	
		
//Windows Handling in this page side textbox (heading tabs) wikipedia to click link to open next next tab	  
	   
        WebElement searchbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchbox.sendKeys("java");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	  List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));//To get all links	
	   for (WebElement link : allLinks) {
		System.out.println("Opened links: " + link.getText());
			link.click();
		}
     	
	   String parentid = driver.getWindowHandle();   // to get parent window id(one id)
		System.out.println("Parent Window:"  +parentid);

        
		Set<String> allwindows = driver.getWindowHandles();   // to get all window id including parent window id too...
		for(String id : allwindows) {
			System.out.println("All windows:" + id);
			
			//to get title
			driver.switchTo().window(id);
			String title =driver.getTitle();
			System.out.println(title);
		
			//to get particular title page open  using if
			if(title.equals("Java (programming language) - Wikipedia"))
			{
			System.out.println("Found the Java programming language page!");
			break;	
			
			}}
		Thread.sleep(2000);
		driver.quit();	
		

		
//Using DoubleCLick method on this page and // twelve,thirteen program there also i have used action class
		
		WebElement field1 = driver.findElement(By.id("field1"));	
		field1.clear();
		field1.sendKeys("Suba");
		Thread.sleep(3000);
		
		WebElement copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions actions= new Actions(driver); //Using action class for double click
		actions.doubleClick(copytext).perform();	


//Using drag and drop
		
		WebElement Dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Dropme = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Dragme, Dropme).build().perform();
		
		
//right click on link (Laptop Link apple example)
		
		WebElement apple = driver.findElement(By.id("apple"));
		Actions acts = new Actions(driver); 
		acts.contextClick(apple).perform();
		
}}