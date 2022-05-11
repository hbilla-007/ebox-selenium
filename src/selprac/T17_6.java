package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T17_6 {
	public static Boolean userName,passWord;
	public static String h1Element,result1,result2,result3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/handlingRegex.html");
		userName=driver.findElement(By.id("username")).isDisplayed();
		passWord=driver.findElement(By.id("password")).isDisplayed();
		driver.findElement(By.tagName("h1")).isDisplayed();
		h1Element=driver.findElement(By.tagName("h1")).getText();
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[11]/td[2]/input")).click();
		result1=driver.findElement(By.id("validationResult")).getText();
		driver.navigate().refresh();
		driver.findElement(By.id("first_name")).sendKeys("Maya");
		driver.findElement(By.id("last_name")).sendKeys("Sri");
		driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
		driver.findElement(By.id("city")).sendKeys("Coimbatore");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("pincode")).sendKeys("654343");
		driver.findElement(By.id("username")).sendKeys("Maya");
		driver.findElement(By.id("password")).sendKeys("maya123");
		driver.findElement(By.id("email")).sendKeys(" mayagmail.com");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[11]/td[2]/input")).click();
		result2=driver.findElement(By.id("validationResult")).getText();;
		driver.navigate().refresh();
		driver.findElement(By.id("first_name")).sendKeys("Maya");
		driver.findElement(By.id("last_name")).sendKeys("Sri");
		driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
		driver.findElement(By.id("city")).sendKeys("Coimbatore");
		driver.findElement(By.id("state")).sendKeys("TN");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("pincode")).sendKeys("654343");
		driver.findElement(By.id("username")).sendKeys("Maya");
		driver.findElement(By.id("password")).sendKeys("maya123");
		driver.findElement(By.id("email")).sendKeys("maya@gmail.com");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[11]/td[2]/input")).click();
		result3=driver.findElement(By.id("validationResult")).getText();;
	}

}
