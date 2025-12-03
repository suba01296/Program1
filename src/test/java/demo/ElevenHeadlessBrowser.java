package demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElevenHeadlessBrowser {
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
	    c.addArguments("--headless");
	    
	    WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);

}}
