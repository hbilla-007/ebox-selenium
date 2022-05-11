package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_ad_hots_1 {
	public static boolean isField1Present = false;
	  public static boolean isField2Present = false;
	  public static boolean isField3Present = false;
	  public static boolean isField4Present = false;
	  public static boolean isField5Present = false;
	  public static boolean isButtonPresent = false;
	  public static String tlead = "";
	  public static String m1 = "";
	  public static String m2 = "";
	  public static String m3 = "";
	  public static String m4 = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/base_projects/20999_index.html");
		isField1Present=driver.findElement(By.id("leader")).isDisplayed();
		isButtonPresent=driver.findElement(By.id("addTeam")).isDisplayed();
		driver.findElement(By.id("addTeam")).click();
		
		isField2Present=driver.findElement(By.id("member1")).isDisplayed();
		driver.findElement(By.id("addTeam")).click();
		isField3Present=driver.findElement(By.id("member2")).isDisplayed();
		driver.findElement(By.id("addTeam")).click();
		isField4Present=driver.findElement(By.id("member3")).isDisplayed();
		driver.findElement(By.id("addTeam")).click();
		isField5Present=driver.findElement(By.id("member4")).isDisplayed();
		driver.findElement(By.id("leader")).sendKeys("Hazel");
		driver.findElement(By.id("member1")).sendKeys("Grace");
		driver.findElement(By.id("member2")).sendKeys("Lancaster");
		driver.findElement(By.id("member3")).sendKeys("Aster");
		driver.findElement(By.id("member4")).sendKeys("Ash");
		driver.findElement(By.id("addTeam")).click();
       tlead=driver.findElement(By.id("tlead")).getText();
       m1=driver.findElement(By.id("m1")).getText();
       m2=driver.findElement(By.id("m2")).getText();
       m3=driver.findElement(By.id("m3")).getText();
       m4=driver.findElement(By.id("m4")).getText();
       
	}

}
