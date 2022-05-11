package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T16_Assess {
	public static String h3Tag;
	public static String textColor;
	public static int divWidth;
	public static int divHeight;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://app.e-box.co.in/uploads/index10518.html");
		divWidth=driver.findElement(By.id("myDiv")).getSize().getWidth();
    	System.out.println(divWidth);
		divHeight=driver.findElement(By.id("myDiv")).getSize().getHeight();
		System.out.println(divHeight);
		h3Tag=	driver.findElement(By.tagName("h3")).getText();
		System.out.println(h3Tag);
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.tagName("h3"))).perform();
		
		textColor=driver.findElement(By.id("header")).getCssValue("color");
		System.out.println(textColor);

	}

}
