package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T17_add_hots_2 {
	public static String hallName;
	public static boolean checkSlider;
	public static int beforex;
	public static int beforey;
	public static int afterx;
	public static int aftery;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/indexsandd_new.html");
		Actions act=new Actions(driver);
		beforex=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getLocation().getX();
		beforey=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getLocation().getY();
		hallName=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h4")).getText();
		checkSlider=driver.findElement(By.id("slider-range")).isDisplayed();
		
		WebElement drag=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]"));
		WebElement drop=driver.findElement(By.id("dragged-details"));
		act.dragAndDrop(drag, drop).build().perform();
		afterx=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getLocation().getX();
		aftery=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getLocation().getY();
		System.out.println(hallName);
		
	}

}
