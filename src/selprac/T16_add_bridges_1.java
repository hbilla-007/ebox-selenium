package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_add_bridges_1 {
	public static String titleNov;
	public static String titleOct;
	public static String pTagOne;
	public static String pTagTwo;
	public static String pTagThree;
	public static String H4TagThree;	
	public static String H4TagOne;
	public static String H4TagTwo;
	public static String idRecent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/events_10517.html");
		driver.findElement(By.id("EventsOct")).isDisplayed();
		driver.findElement(By.id("EventsNov")).isDisplayed();
		titleOct=driver.findElement(By.id("EventsOct")).getText();
		titleNov=driver.findElement(By.id("EventsNov")).getText();
		pTagOne=driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]/div[2]/p")).getText();
		pTagTwo=driver.findElement(By.id("secondP")).getText();
		pTagThree=driver.findElement(By.id("thirdP")).getText();
		H4TagOne=driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]/div[2]/h4")).getText();
		H4TagTwo=driver.findElement(By.id("secondHeader")).getText();
		H4TagThree=driver.findElement(By.id("thirdHeader")).getText();
		driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[3]/div[2]")).click();
		idRecent=driver.findElement(By.id("recent")).getText();
		/*driver.findElement(By.xpath("//*[@id=\"recent\"]/ul[2]/li/ul")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"recent\"]/ul[3]/li/ul")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"recent\"]/ul[4]/li/ul")).isDisplayed();*/
		//System.out.println(str);
	}

}
