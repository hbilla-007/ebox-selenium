package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*driver = new FirefoxDriver();
driver.get(baseUrl);
driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);*/
public class T15_1 {

	public static boolean isTagPresent = false;
	  public static String h1Text = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19248-text.html");
	 isTagPresent=driver.findElement(By.tagName("h1")).isDisplayed();
	 System.out.println(isTagPresent);
	 h1Text=driver.findElement(By.tagName("h1")).getText();
	 System.out.println(h1Text);
	 driver.quit();

	}

}
