package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_ad_hots_2 {
	public static boolean isHeaderPresent = false;
	  public static boolean isField1Present = false;
	  public static boolean isField2Present = false;
	  public static boolean isField3Present = false;
	  public static boolean isField4Present = false;
	  public static boolean isField5Present = false;
	  public static boolean isField6Present = false;
	  public static boolean isButtonPresent = false;
	  public static String result = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19442-hidden.html");
		isHeaderPresent=driver.findElement(By.tagName("h1")).isDisplayed();
		isField1Present=driver.findElement(By.id("name")).isDisplayed();
		isField2Present=driver.findElement(By.id("email")).isDisplayed();
		isField3Present=driver.findElement(By.id("phoneNumber")).isDisplayed();
		isField4Present=driver.findElement(By.id("userName")).isDisplayed();
		isField5Present=driver.findElement(By.id("password")).isDisplayed();
		isField6Present=driver.findElement(By.id("hidden")).isEnabled();
		isButtonPresent=driver.findElement(By.id("register")).isDisplayed();
		driver.findElement(By.id("name")).sendKeys("Praveen");
		driver.findElement(By.id("email")).sendKeys("praveen@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("9845968485");
		driver.findElement(By.id("userName")).sendKeys("PraveenRamKumar");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.id("register")).click();
       result=driver.findElement(By.id("result")).getText();
       System.out.println(result);
	}

}
