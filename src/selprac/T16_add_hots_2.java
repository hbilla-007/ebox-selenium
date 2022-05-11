package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_add_hots_2 {
	public static Boolean dateTimePickerPresent;
	public static String name;
	public static String phoneNumber;
	public static String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/indexDateTimePicker.html");
		driver.findElement(By.id("name")).isDisplayed();
    	driver.findElement(By.id("phoneNumber")).isDisplayed();
		driver.findElement(By.id("address")).isDisplayed();
		driver.findElement(By.id("eventDate")).isDisplayed();

		dateTimePickerPresent=driver.findElement(By.tagName("input")).isDisplayed();
		System.out.println(dateTimePickerPresent);
		driver.findElement(By.id("name")).sendKeys("Prithvi");
		driver.findElement(By.id("phoneNumber")).sendKeys(" 9588625945");
		driver.findElement(By.id("address")).sendKeys("74, Sathyamoorthy Street, Chennai");
		driver.findElement(By.id("calculate")).click();
		name=driver.findElement(By.id("name")).getAttribute("value");
    	phoneNumber=driver.findElement(By.id("phoneNumber")).getAttribute("value");
		address=driver.findElement(By.id("address")).getAttribute("value");
		System.out.println(name+" "+phoneNumber+" "+address);
		
	}

}
