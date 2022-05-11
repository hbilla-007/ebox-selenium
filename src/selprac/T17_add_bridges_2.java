package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T17_add_bridges_2 {
	public static String imageName;
	  public static String eventTitle;
	  public static String imageTitle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/popoverindexfirst.html#");
		eventTitle=driver.findElement(By.tagName("h1")).getText();
		WebElement m=driver.findElement(By.id("popover1"));
		Actions act=new Actions(driver);
		act.moveToElement(m).build().perform();
		imageTitle=driver.findElement(By.tagName("h3")).getText();
		imageName=driver.findElement(By.cssSelector("img")).getAttribute("src");
        System.out.println(imageTitle);
        
	}

}
