package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_Assess {
	public static boolean isHeaderPresent = false;
	  public static boolean isField1Present = false;
	  public static boolean isField2Present = false;
	  public static boolean isField3Present = false;
	  public static boolean isField4Present = false;
	  public static boolean isField5Present = false;
	  public static boolean isButtonPresent = false;
	  public static String rname = "";
	  public static String rusername = "";
	  public static String rmobile = "";
	  public static String raddress = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19439-onsubmit.html");
		isHeaderPresent=driver.findElement(By.id("header")).isDisplayed();
		isField1Present=driver.findElement(By.id("name")).isDisplayed();
		isField2Present=driver.findElement(By.id("username")).isDisplayed();
		isField3Present=driver.findElement(By.id("password")).isDisplayed();
		isField4Present=driver.findElement(By.id("mobilenumber")).isDisplayed();
		isField5Present=driver.findElement(By.id("address")).isDisplayed();
		isButtonPresent=driver.findElement(By.id("register")).isDisplayed();
		driver.findElement(By.id("name")).sendKeys("Hazel");
		driver.findElement(By.id("username")).sendKeys("hazelgrace");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("mobilenumber")).sendKeys("123456789");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("register")).click();
		rname=driver.findElement(By.id("rname")).getText();
		rusername=driver.findElement(By.id("rusername")).getText();
		rmobile=driver.findElement(By.id("rmobile")).getText();
		raddress=driver.findElement(By.id("raddress")).getText();
	}

}
