package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SixthWebPageTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		

		WebElement firstname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		firstname.sendKeys("Suba");
		
		WebElement lastname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
		lastname.sendKeys("P");
		
		WebElement address = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
		address.sendKeys("Chennai");
		
		WebElement email = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
		email.sendKeys("suba@gmail.com");
		
		WebElement phonenumber = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
		phonenumber.sendKeys("0123456789");
		
		WebElement male = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
		male.click();
		boolean maleclick = male.isSelected();
		System.out.println("Male   :"   +  maleclick);

		WebElement female = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
		female.click();
		boolean femaleclick = female.isSelected();
		System.out.println("Female  :"  +  femaleclick);
		
	
		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();
		boolean cricketselect = cricket.isSelected();
		System.out.println("Hobbies :"   +  cricketselect);
		
		WebElement movies = driver.findElement(By.id("checkbox2"));
		movies.click();
		boolean moviesselect = cricket.isSelected();
		System.out.println("Hobbies :"   +  moviesselect);
		
		WebElement Hockey = driver.findElement(By.id("checkbox3"));
		Hockey.click();
		boolean hockeyselect = cricket.isSelected();
		System.out.println("Hobbies :"   +  hockeyselect);
	
		WebElement language = driver.findElement(By.id("msdd"));
		language.click();
		WebElement english= driver.findElement(By.xpath("//a[text()='English']"));
		english.click();
		
		WebElement german = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[13]/a"));
		german.click();
		
		WebElement urdu = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[40]/a"));
		urdu.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByValue("AutoCAD");
		
		WebElement doy = driver.findElement(By.id("yearbox"));
		Select y = new Select(doy);
		y.selectByValue("1996");
		
		WebElement dom = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));
		Select  m = new Select(dom);
		m.selectByVisibleText("March");
		
		WebElement dod = driver.findElement(By.id("daybox"));
		Select d = new Select(dod);
		d.selectByIndex(2);				
				
		WebElement password = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input"));
		password.sendKeys("1234");
		
		WebElement confirmpassword = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input"));
		confirmpassword.sendKeys("1234");
		
		
		Thread.sleep(6000);
				
}}
