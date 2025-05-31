package org.pom1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Helper;

public class junit extends Helper {
		
		public static WebDriver driver;
		
		@Before
		
		public void browserLaunch() {
			driver=new ChromeDriver();
		
			driver.get("https://accounts.shopify.com/lookup?rid=805b8e6d-acbf-45de-a541-9c19d174f8d7&verify=1746167738-DnGrbYdo0dFz0wFBkXY3rlHtPHw2LuxE8JwGZXoOSd8%3D");
			driver.manage().window().maximize();
		
		
		}
		
		@Test
		
		public void Tc_01() {
			
			WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
			
			fillText(username, "raja@gmail.com");
			
			Assert.assertEquals("raja@gmail.com", username.getAttribute("value"));
			

			
			
		}
	}
	
	


