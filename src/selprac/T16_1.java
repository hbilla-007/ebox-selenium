package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_1 {
	public static Boolean h2Present;
	public static String h2ElementText;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/weddingc.html");
		h2Present=driver.findElement(By.tagName("h2")).isDisplayed();
		h2ElementText=driver.findElement(By.tagName("h2")).getText();
		
      System.out.println(h2ElementText);
	}

}
