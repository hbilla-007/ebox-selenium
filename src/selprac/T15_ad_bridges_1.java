package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_ad_bridges_1 {
	 public static boolean isButtonPresent = false;
	  public static String elem1 = "";
	  public static String elem2 = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl="http://hcl.e-box.co.in/uploads/Selenium_base_projects/19266-index.html";
		driver.get(baseUrl);
		isButtonPresent=driver.findElement(By.id("button")).isDisplayed();
		driver.findElement(By.id("button")).click();
		elem1=driver.findElement(By.xpath("//*[@id=\"elem1\"]")).getText();
		elem2=driver.findElement(By.xpath("//*[@id=\"elem2\"]")).getText();
		System.out.println(elem1);
		System.out.println(elem2);
	}

}
