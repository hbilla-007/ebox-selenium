package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_add_bridges_3 {
	public static Boolean divPresent;
	public static String h2ElementText,result1,result2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/emailValidation.html");
		h2ElementText=driver.findElement(By.tagName("h2")).getText();
		driver.findElement(By.id("email")).sendKeys(" mayagmail.com");
		driver.findElement(By.id("validate")).click();
		divPresent=driver.findElement(By.id("result")).isDisplayed();
		result1=driver.findElement(By.id("result")).getText();
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("maya@gmail.com");
		driver.findElement(By.id("validate")).click();
		result2=driver.findElement(By.id("result")).getText();
	}

}
