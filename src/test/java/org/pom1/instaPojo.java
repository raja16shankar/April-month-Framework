package org.pom1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instaPojo extends instaHelper {
	
	public instaPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

}
