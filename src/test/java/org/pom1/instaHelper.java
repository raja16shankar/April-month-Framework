package org.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaHelper {
	
public static WebDriver driver;
	
	public static void broswerLaunch(String url) {
		
		driver= new ChromeDriver();
		driver.get(url);	
	}
	
	public static void winmax() {

		driver.manage().window().maximize();
	}
	
	public static void browserclose() {

		driver.quit();
	}
	public static void printTilte() {
		
		String title =driver.getTitle();
		System.out.println(title);
		
	}
	public static void printurl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	public static void fillText(WebElement element,String text) {
		element.sendKeys(text);		

	}
	public static void buttonclick(WebElement element) {
		element.click();

	}
	public static void refresh() {

		driver.navigate().refresh();
	}


}
