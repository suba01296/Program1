package demo;


import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

	public class ClassExtendsNineth extends NinethBaseClass{

	    public static void main(String[] args) {
	        // Option 1: Call static method directly using class name
	    	
	        WebDriver driver = NinethBaseClass.browsersetup("chrome");	        
	        @Nullable
	    	String currentUrl = driver.getCurrentUrl();
	    	System.out.println("URL:"  +  currentUrl);	
	        
	        
	

	        // Option 2: Call static method using object of child class is not recommended
	    	
//	        ClassExtendsNineth obj = new ClassExtendsNineth();
//	        WebDriver driver = obj.browsersetup("Firefox");  //  returns WebDriver
//	    	@Nullable
//	    	String title = driver.getTitle();	
//	    	System.out.println("Title:" + title);	
	    	
	    }}    
    
	        
	    


