package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_add_hots_1 {
	public static Boolean weddingTextPresent;
	public static Boolean corporateTextPresent;
	public static Boolean socialTextPresent;
	public static String link1;
	public static String link2;
	public static String link3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/LinkText.html");
		weddingTextPresent=driver.findElement(By.linkText("Wedding Events")).isDisplayed();
	    corporateTextPresent=driver.findElement(By.linkText("Corporate Events")).isDisplayed();
	    socialTextPresent=driver.findElement(By.linkText("SocialGatherings")).isDisplayed();
	    link1=driver.findElement(By.linkText("Wedding Events")).getAttribute("href");
	    driver.findElement(By.linkText("Wedding Events")).click();
	    driver.navigate().back();
	    link2=driver.findElement(By.linkText("Corporate Events")).getAttribute("href");
	    driver.findElement(By.linkText("Corporate Events")).click();
	    driver.navigate().back();
	    link3=driver.findElement(By.linkText("SocialGatherings")).getAttribute("href");
	    driver.findElement(By.linkText("SocialGatherings")).click();
	    
	    System.out.println(link1);
	    
	}

}
