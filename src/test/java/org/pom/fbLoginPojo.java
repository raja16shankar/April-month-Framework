package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLoginPojo extends Helper{
	
	public fbLoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	public WebElement emailID;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginbutton;
	
	public WebElement getEmailID() {
		return emailID;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
