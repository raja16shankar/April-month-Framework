  package org.execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScript extends SeleniumBase {
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumBase a=new SeleniumBase();
		a.initdriver("chromedriver");
		a.applicationLaunch("https://adactinhotelapp.com/");
		a.windosmax();
		WebElement username = a.driver.findElement(By.xpath("//input[@name='username']"));
		a.sendKeysByJava(username, "Roopa2025");
		WebElement password = a.driver.findElement(By.xpath("//input[@name='password']"));
		a.sendKeysByJava(password,"Cat@dog@123");
		a.driver.findElement(By.xpath("//input[@class='login_button']")).click();
		WebElement location = a.driver.findElement(By.xpath("//select[@name='location']"));
		a.SelectByValue(location, "London");
		WebElement hotels = a.driver.findElement(By.xpath("//select[@name='hotels']"));
		a.SelectByValue(hotels, "Hotel Sunshine");
		WebElement Roomtype = a.driver.findElement(By.xpath("//select[@name='room_type']"));
		a.SelectByValue(Roomtype, "Deluxe");
				
		WebElement NumberOfRooms = a.driver.findElement(By.xpath("//select[@name='room_nos']"));
		a.SelectByValue(NumberOfRooms, "2");
		
	//	WebElement checkin = a.driver.findElement(By.xpath("//select[@name='datepick_in']"));
	//	checkin.sendKeys("26/05/2025");
	//	WebElement checkout = a.driver.findElement(By.xpath("//select[@name='datepick_out']"));
	//checkout.sendKeys("27/05/2025");
		WebElement Adultroom = a.driver.findElement(By.xpath("//select[@name='adult_room']"));
		a.SelectByValue(Adultroom, "2");
		WebElement childroom = a.driver.findElement(By.xpath("//select[@name='child_room']"));
		a.SelectByValue(childroom, "2");
		a.driver.findElement(By.id("Submit")).click();
		a.driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		a.driver.findElement(By.xpath("//input[@name='continue']")).click();
		a.driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("rajashankar");
		a.driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("subbaraju");
		a.driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("madurai");
		a.driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
		WebElement creditcard = a.driver.findElement(By.xpath("//select[@name='cc_type']"));
		a.SelectByValue(creditcard, "VISA");
		WebElement expmonth = a.driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		a.SelectByValue(expmonth, "3");
		WebElement expyear = a.driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		a.SelectByValue(expyear, "2026");
		a.driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		Thread.sleep(5000);
		a.driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(15000);
		a.driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		

		a.driver.findElement(By.xpath("//input[@name='check_all']")).click();
		a.driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		a.driver.switchTo().alert().accept();



		





		
	}

}



	
	


