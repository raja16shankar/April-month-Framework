package org.suit;

import org.openqa.selenium.WebElement;
import org.pom.Helper;
import org.pom.fbLoginPojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class face extends Helper{
	
	@Test
	private void tc4() {
		
		broswerLaunch();
		winmax();
		System.out.println("test4");

	}
	
/*	@Test
	
	private void tc5() {

		fbLoginPojo f=new fbLoginPojo();
		
		WebElement username = f.getEmailID();
		fillText(username, "raja");
		
		WebElement password = f.getPassword();
		fillText(password, "123456");
		
		WebElement loginbutton = f.getLoginbutton();
		buttonclick(loginbutton);
	
		System.out.println("test5");
	}*/
	
//	@Parameters({"username","password"})
	
	@Test(dataProvider="data")
	
	private void tc6(String user,String pass) {
		
		launchurl("https://www.facebook.com/");
		fbLoginPojo f=new fbLoginPojo();
		
		WebElement username = f.getEmailID();
		fillText(username, user);
		
		WebElement password = f.getPassword();
		fillText(password, pass);
		
		System.out.println("test6");

	}
	
	@DataProvider(name="data")
	private Object[][] getdata() {
		
		return new Object [][]{
			{"greens","green@123"},
			{"sql","sql@123"},
			{"raja","raja@123"}
			
			
		};

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
