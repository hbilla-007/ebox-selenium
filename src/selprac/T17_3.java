package selprac;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_3 {
	public static Boolean h2Present,tablePresent;
	public static String h2ElementText,borderAtt,columnSpan1,columnSpan2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/attribute.html");
		 h2Present=driver.findElement(By.tagName("h2")).isDisplayed();
	    	h2ElementText=driver.findElement(By.tagName("h2")).getText();
			tablePresent=driver.findElement(By.tagName("table")).isDisplayed();
			borderAtt=driver.findElement(By.tagName("table")).getAttribute("border");
			columnSpan1=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[3]")).getAttribute("colspan");
			columnSpan2=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[10]/td[3]")).getAttribute("colspan");
			System.out.println(columnSpan1);
            
	}

}
