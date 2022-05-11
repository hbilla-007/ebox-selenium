package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_4 {
	public static boolean isFieldPresent = false;
	  public static boolean isButtonPresent = false;
	  public static String heading = "";
	  public static String result1 = "";
	  public static String result2 = "";
	  public static String result3 = "";
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	String baseUrl = "http://hcl.e-box.co.in/uploads/Selenium_base_projects/19440-search.html";
	driver.get(baseUrl);
	isFieldPresent=driver.findElement(By.id("someText")).isDisplayed();
	isButtonPresent= driver.findElement(By.id("search")).isDisplayed();
	heading=driver.findElement(By.tagName("h1")).getText();
	driver.findElement(By.id("someText")).sendKeys("Corporate events");
	driver.findElement(By.id("search")).click();
	result1=driver.findElement(By.id("result")).getText();
	driver.get(baseUrl);
	driver.findElement(By.id("someText")).sendKeys("Sports events");
	driver.findElement(By.id("search")).click();
	result2=driver.findElement(By.id("result")).getText();
	driver.get(baseUrl);
	driver.findElement(By.id("someText")).sendKeys("Political events");
	driver.findElement(By.id("search")).click();
	result3=driver.findElement(By.id("result")).getText();
	
	
	
}
}
