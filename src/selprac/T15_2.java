package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class T15_2 {
	public static String colorCode = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19437-color.html");
		String color = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getCssValue("background-color");
        colorCode= Color.fromString(color).asHex();
        System.out.println(colorCode);
	}

}
