package org.suit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@Test
	private void tc_1(String browsername) {
		
		if(browsername.startsWith("c")){
			driver=new ChromeDriver();
		}
		
		else if(browsername.contains("f")){
			
			driver=new FirefoxDriver();
		}
		else {
			
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
		
	

}
