package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_ad_bridges_2 {
	public static boolean isField1Present = false;
	  public static boolean isField2Present = false;
	  public static boolean isButtonPresent = false;
	  public static String result = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19443-add.html");
		isField1Present= driver.findElement(By.id("value1")).isDisplayed();
		isField2Present=driver.findElement(By.id("value2")).isDisplayed();
		isButtonPresent=driver.findElement(By.id("submit")).isDisplayed();
		driver.findElement(By.id("value1")).sendKeys("20");;
		driver.findElement(By.id("value2")).sendKeys("10");;
		driver.findElement(By.id("submit")).click();
		result=driver.findElement(By.tagName("div")).getText();
		System.out.println(result);
		
	}

}
