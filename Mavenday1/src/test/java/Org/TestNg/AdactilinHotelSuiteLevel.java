package Org.TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactilinHotelSuiteLevel {
	
	

	public static WebDriver driver;
	@Parameters({"url"})
	@Test(priority=1)
	private void launchBrowser(String urls) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(urls);}
	@Test(priority=2)
	private void maximum() {
		driver.manage().window().maximize();
}
	@Parameters({"username","password"})
	@Test(priority=3)
	private void loginLaunch(String username,String password ) {
		WebElement usernames = driver.findElement(By.id("username"));
		usernames.sendKeys(username);
		WebElement passwords = driver.findElement(By.id("password"));
		passwords.sendKeys("Jamesgosling@50");
		driver.findElement(By.id("login")).click();}	
	@Parameters({"location","hotels","room_nos","datepick_in"})
	@Test(priority=4)
	
	public void searchHotel(String location,String hotels,String room_nos,String datepick_in ) {
		WebElement locations  = driver.findElement(By.name("location"));
		locations.sendKeys(location);
		WebElement hotel = driver.findElement(By.name("hotels"));
		hotel.sendKeys(hotels);
	
		WebElement room_no = driver.findElement(By.name("room_nos"));
		room_no.sendKeys(room_nos);
		WebElement datepick_ins = driver.findElement(By.name("datepick_in"));
		datepick_ins.sendKeys(datepick_in); 
	}
	@Parameters({"datepick_out","adult_room","child_room"})
	@Test(priority=5)
	private void searchHotels(String datepick_out,String adult_room,String child_room) {
		WebElement datepick_outs = driver.findElement(By.name("datepick_out"));
		datepick_outs.sendKeys(datepick_out);
		WebElement adult_rooms = driver.findElement(By.name("adult_room"));
		adult_rooms.sendKeys(adult_room);
		WebElement child_rooms = driver.findElement(By.name("child_room"));
		child_rooms.sendKeys(child_room);
		WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click();

	}
	@Test(priority=6)
	public void selectHotel() {
		WebElement radiobutton_1 = driver.findElement(By.name("radiobutton_1"));
		radiobutton_1.click();
		WebElement continues = driver.findElement(By.name("continue"));
		continues.click();
	}
	@Parameters({"first_name","last_name"})
	@Test(priority=7)
	public static void bookingHotel(String first_name,String last_name) {
		   WebElement first_names = driver.findElement(By.name("first_name"));
		   first_names.sendKeys(first_name);
		   WebElement last_names = driver.findElement(By.name("last_name"));
		   last_names.sendKeys(last_name);}
	
	@Parameters({"address","cc_num","cc_type"})
	@Test(priority=8)
	public static void bookingHotel1(String address,String cc_num,String cc_type) {   
		   WebElement address1 = driver.findElement(By.name("address"));
		   address1.sendKeys(address);
		   WebElement cc_num1 = driver.findElement(By.name("cc_num"));
		   cc_num1.sendKeys(cc_num);
		   WebElement cc_type1 = driver.findElement(By.name("cc_type"));
		   cc_type1.sendKeys(cc_type);
		}
	
	@Parameters({"cc_exp_month","cc_exp_year","cc_cvv"})
	@Test(priority=9)
	public static void booking(String cc_exp_month,String cc_exp_year,String cc_cvv) throws InterruptedException  {
		   WebElement cc_exp_months = driver.findElement(By.name("cc_exp_month"));
		   cc_exp_months.sendKeys(cc_exp_month);
		   WebElement cc_exp_years = driver.findElement(By.name("cc_exp_year"));
		   cc_exp_years.sendKeys(cc_exp_year);
		   WebElement cc_cvv1 = driver.findElement(By.name("cc_cvv"));
		   cc_cvv1.sendKeys(cc_cvv);
		   WebElement book_now = driver.findElement(By.name("book_now"));
		   book_now.click();
		   Thread.sleep(5000);
	
	}

	@Parameters({"order_no"})
	@Test(priority=10)
	
	 public static void orderNo() {
		   String order_nos = driver.findElement(By.name("order_no")).getAttribute("value");
		   System.out.println("hotel id :"+order_nos);
		   System.out.println("welcome to Adactin hotel");
		   driver.findElement(By.name("my_itinerary")).click();
		   WebElement order_id_text = driver.findElement(By.name("order_id_text"));
		   order_id_text.sendKeys(order_nos); 
		   WebElement search_hotel_id = driver.findElement(By.name("search_hotel_id"));
		   search_hotel_id.click();	   
		   }
	
	@Test(priority=11)
	 public static void cancelOrder()  {
		 driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		 WebElement cancel = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
		 cancel.click();
	}
	@Test(priority=12)
	private void alert() throws InterruptedException {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		WebElement ordercancel = driver.findElement(By.xpath("//label[contains(text(),'The booking has been cancelled.')]"));
		String text = ordercancel.getText();
		System.out.println(text);
		System.out.println("ohh no....");
		
		driver.quit();

	}

}