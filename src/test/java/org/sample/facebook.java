package org.sample;

import org.openqa.selenium.WebElement;
import org.pom.Helper;
import org.pom.fbLoginPojo;

public class facebook extends Helper {
	
	public static void main(String[] args) {
		
		launchurl("https://www.facebook.com/");
		
		winmax();
		
		fbLoginPojo f=new fbLoginPojo();
		
	WebElement username =f.getEmailID();
	fillText(username, "raja");
	
	refresh();
	
	fillText(username, "shankar");
		
		
		
	}
	
	

}
