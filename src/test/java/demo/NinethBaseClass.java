package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NinethBaseClass {

     public static WebDriver browsersetup(String browser) {
    	  WebDriver driver = null ;
    	 
    	 
    	/*switch (browser) {
    	 case "chrome":    	 
         driver = new ChromeDriver();
    	 driver.get("https://www.google.com/");
    	 driver.manage().window().maximize();
    	 break;
    	 
    	 case "edge":    		
    	 driver = new EdgeDriver();
    	 driver.get("https://www.google.com/");
    	 driver.manage().window().maximize();
    	 break;
    	 	
    	 case "Firefox":    		 
    	 driver = new FirefoxDriver();
    	 driver.get("https://www.google.com/");
    	 driver.manage().window().maximize();    	 
    	 break;
    	 
    	 default:
    		 System.out.println("Provide Valid Browser Name");    	 	 
    	 } */
    	  
   //using if else 
    	  if (browser == "chrome") {
    	        driver = new ChromeDriver();
    	        driver.get("https://www.google.com/");
    	        driver.manage().window().maximize();

    	    } else if (browser == "edge") {
    	        driver = new EdgeDriver();
    	        driver.get("https://www.google.com/");
    	        driver.manage().window().maximize();

    	    } else if (browser == "Firefox") {
    	        driver = new FirefoxDriver();
    	        driver.get("https://www.google.com/");
    	        driver.manage().window().maximize();

    	    } else {
    	        System.out.println("Provide a valid browser name");
    	    }

    	    
    	 return driver;
     }}
	
	
	
	
	
     