package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_2 {
	public static String stockdetails;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://app.e-box.co.in/uploads/filter_10555.html");
	     stockdetails=driver.findElement(By.id("Stock-table")).getText();
	     driver.findElement(By.xpath("//*[@id=\"Stock-table\"]/tbody/tr[8]/td[1]")).isDisplayed();
	     driver.findElement(By.xpath("//*[@id=\"Stock-table\"]/tbody/tr[8]/td[2]")).isDisplayed();
	}

}
