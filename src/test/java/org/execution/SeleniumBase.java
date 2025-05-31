package org.execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase {
	public  WebDriver driver;
	
	public void initdriver(String browserType) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void applicationLaunch(String url) {
		
		driver.get(url);

	}
	public void windosmax() {
		driver.manage().window().maximize();
	}
	
	public void sendKeysByJava(WebElement element,String KeysToSend) {
		element.sendKeys(KeysToSend);
		
	}
	public void clickByJava(WebElement element) {
		element.click();
		
	}
	
	public void SelectByValue(WebElement element,String value) {
	
		Select select=new Select (element);
		select.selectByValue(value);
		
	}
		
		
	}


	