package demo;


import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdWebpageIdentify {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
     	driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();

//1.getCurrentURL
		
	/*@Nullable
	String currentUrl = driver.getCurrentUrl();
	System.out.println("URL:"  +  currentUrl);	
		
		
//2.getTitle
		
	@Nullable
	String title = driver.getTitle();	
	System.out.println("Title:" + title);	
	
	
//3.getPageSource
		
	@Nullable
	String pageSource = driver.getPageSource();
	System.out.println("PageSource:"   +  pageSource);	*/
		
		
//4.Using isDisplayed,isEnabled
		
	WebElement searchbox = driver.findElement(By.name("q"));
	boolean enabledStatus= searchbox.isEnabled();	
	System.out.println("Status:"  +  enabledStatus);	
	 
	
	boolean displayedStatus= searchbox.isDisplayed();	
	System.out.println("Status:"  +  displayedStatus);
	
    
	
	
//5.using navigate
		/*driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
	    driver.navigate().forward();
		
	    Thread.sleep(3000);
		driver.close();		
		
		
		
	
//6.using get attributes in webpage in dom
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//using gettext
		WebElement googleabout = driver.findElement(By.linkText("About")); 
	    System.out.println(googleabout.getText());	

	  //using getdomattribute
	   WebElement searchbox1= driver.findElement(By.id("APjFqb")); 
       @Nullable
	   String domAttribute = searchbox1.getDomAttribute("name");
       System.out.println(domAttribute);
       
        
        //using getattribute to find value 
        WebElement textbox= driver.findElement(By.id("APjFqb")); 
        textbox.sendKeys("cars");
        textbox.sendKeys(Keys.ENTER);
		@Nullable
		String attribute = textbox.getAttribute("value");
		System.out.println(attribute);*/
		
}}
