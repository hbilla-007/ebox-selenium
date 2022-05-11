package selprac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_3 {
	public static String alertMessage;
	public static String name;
	public static String resultTag;
	 public static String venue;
	 public static String date;
	 public static String price;
	 public static String count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
         driver.get("https://app.e-box.co.in/uploads/index_10538.html");
        // driver.get("https://app.e-box.co.in/uploads/index_10538.html");
          driver.findElement(By.id("name")).sendKeys("Birthday Party");
          driver.findElement(By.id("venue")).sendKeys("HR Mahal");
          driver.findElement(By.id("date")).sendKeys("06/09/2018");
          driver.findElement(By.id("price")).sendKeys("120000");
          driver.findElement(By.id("count")).sendKeys("1");
          driver.findElement(By.id("addEvent")).click();
        Alert alert=driver.switchTo().alert();
        
        alertMessage=alert.getText();
       //String s=alert.getText();
        alert.accept();
        resultTag=driver.findElement(By.id("resultTable")).getText();
        name=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[1]")).getText();
        venue=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]")).getText();
        date=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]")).getText();
        //price=driver.findElement(By.id("price")).getText();
        price=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[4]")).getText();
       
}
}