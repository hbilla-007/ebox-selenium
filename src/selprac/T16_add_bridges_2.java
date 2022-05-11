package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_add_bridges_2 {
	public static Boolean h1Present, fieldname1, fieldname2, fieldname3;
	public static String h1Element, welcomeMsg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://app.e-box.co.in/uploads/Forms_new1.html");
        h1Present=driver.findElement(By.tagName("h1")).isDisplayed();
        h1Element=driver.findElement(By.tagName("h1")).getText();
        fieldname1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/input")).isDisplayed();
        fieldname2=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).isDisplayed();
        fieldname3=driver.findElement(By.id("loginButton")).isDisplayed();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/input")).sendKeys("Minion");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).sendKeys("minion");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("result")).isDisplayed();
        welcomeMsg=driver.findElement(By.id("result")).getText();
	}

}
