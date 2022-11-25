package com.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 14",Keys.ENTER);
		List<WebElement> iphone14 = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][1]"));
		System.out.println("-----------iphone Name------------");
		for (int i = 0; i <=13; i++) {
			WebElement webElement = iphone14.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("-----------iphone price------------");
		List<WebElement> iphene14price = driver.findElements(By.xpath("//span[contains(@class,'a-price-whole')][1]"));
		    for (int i = 0; i <=13; i++) {
			
		 	WebElement webElement = iphene14price.get(i);
			String text1 = webElement.getText();
			System.out.println(text1);
		      }
		driver.quit();
		}

}
