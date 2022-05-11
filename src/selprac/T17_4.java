package selprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_4 {

	public static String str1;
	  public static String str2;
	  public static String str3;
	  public static String eventName;
	  public static String hallName;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.talentrank.in/uploads/indexWaits1_new.html");
		 str1=driver.findElement(By.id("homeLink")).getText();
		 str2=driver.findElement(By.id("event")).getText();
		 str3=driver.findElement(By.id("hall")).getText();
		
		 driver.findElement(By.id("event")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 eventName=driver.findElement(By.id("eventName")).getText();
		 driver.findElement(By.id("hall")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 hallName=driver.findElement(By.id("hallName")).getText();
		 

}
}