package org.pom1;

import org.openqa.selenium.WebElement;

public class insta extends instaHelper {
	public static void main(String[] args) {
		
		broswerLaunch("https://www.instagram.com/");
		winmax();
	
		instaPojo i=new instaPojo();
		
	WebElement username = i.getUsername();
	username.sendKeys("raja");
		WebElement password = i.getPassword();
		fillText(password, "12345");
			
		
	}

}
