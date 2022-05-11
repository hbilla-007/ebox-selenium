package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_2 {
	public static Boolean h2Present;
	public static String h2ElementText,headerTxt,tableDataTxt1,tableDataTxt2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://app.e-box.co.in/uploads/EventsTable.html");
     h2Present=driver.findElement(By.xpath("/html/body/center/h2")).isDisplayed();
     h2ElementText=driver.findElement(By.xpath("/html/body/center/h2")).getText();
     headerTxt=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/th[3]")).getText();
     tableDataTxt1=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[2]")).getText();
     tableDataTxt2=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[8]/td[4]")).getText();
	}

}
