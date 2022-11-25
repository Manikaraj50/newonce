package com.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactilinHotelJunit {
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println("url launching is succefull");

	}
	@Before
	public void loginLaunch() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Jamesgosling");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Jamesgosling@50");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		System.out.println("login launch is successfull");
	}
	@Test
	public void searchHotel() {
		WebElement location  = driver.findElement(By.name("location"));
		location.sendKeys("London");
		WebElement hotels = driver.findElement(By.name("hotels"));
		hotels.sendKeys("Hotel Sunshine");
		WebElement room_nos = driver.findElement(By.name("room_nos"));
		room_nos.sendKeys("2");
		WebElement datepick_in = driver.findElement(By.name("datepick_in"));
		datepick_in.sendKeys("25/09/2022"); 
		WebElement datepick_out = driver.findElement(By.name("datepick_out"));
		datepick_out.sendKeys("28/09/2022");
		WebElement adult_room = driver.findElement(By.name("adult_room"));
		adult_room.sendKeys("2");
		WebElement child_room = driver.findElement(By.name("child_room"));
		child_room.sendKeys("1");
		WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click();
		System.out.println("searchHotel is successfull");

	}
	@After
	public void selectHotel() {
		WebElement radiobutton_1 = driver.findElement(By.name("radiobutton_1"));
		radiobutton_1.click();
		WebElement continues = driver.findElement(By.name("continue"));
		continues.click();
		System.out.println("select hotel is successfull");

	}
	@AfterClass
	public static void bookingHotel() throws InterruptedException {
	   WebElement first_name = driver.findElement(By.name("first_name"));
	   first_name.sendKeys("jona");
	   WebElement last_name = driver.findElement(By.name("last_name"));
	   last_name.sendKeys("sasi");
	   WebElement address = driver.findElement(By.name("address"));
	   address.sendKeys("chennai");
	   WebElement cc_num = driver.findElement(By.name("cc_num"));
	   cc_num.sendKeys("0123456789987654");
	   WebElement cc_type = driver.findElement(By.name("cc_type"));
	   cc_type.sendKeys("VISA");
	   WebElement cc_exp_month = driver.findElement(By.name("cc_exp_month"));
	   cc_exp_month.sendKeys("February");
	   WebElement cc_exp_year = driver.findElement(By.name("cc_exp_year"));
	   cc_exp_year.sendKeys("2022");
	   WebElement cc_cvv = driver.findElement(By.name("cc_cvv"));
	   cc_cvv.sendKeys("2566");
	   WebElement book_now = driver.findElement(By.name("book_now"));
	   book_now.click();
	   System.out.println("bookingHotel is successfull");
	   Thread.sleep(5000);
	   String orderid = driver.findElement(By.name("order_no")).getAttribute("value");
	   System.out.println("hotel id :"+orderid);
	   System.out.println("welcome to Adactin hotel");
	   driver.quit();
	   
	}

}
