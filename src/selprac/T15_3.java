package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_3 {
	 public static boolean isField1Present = false;
	  public static boolean isField2Present = false;
	  public static boolean isButtonPresent = false;
	  public static String result = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19438-login.html");
		isField1Present=driver.findElement(By.id("username")).isDisplayed();
		isField2Present=driver.findElement(By.id("password")).isDisplayed();
		isButtonPresent=driver.findElement(By.id("submit")).isDisplayed();
		driver.findElement(By.id("username")).sendKeys("Aishwarya");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("submit")).click();
        result=driver.findElement(By.id("result")).getText();
        System.out.println(result);
        driver.quit();
	}

}
