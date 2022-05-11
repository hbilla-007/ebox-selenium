package selprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tofightnoofTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.cricbuzz.com/");
    List <WebElement> li= driver.findElements(By.tagName("a"));
    int count;
    count=li.size();
    System.out.println(count);
    driver.close();
	}

}
