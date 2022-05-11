package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_add_hots_1 {
	public static Boolean userName,passWord;
	public static String h1Element,nameTxt,genderTxt,eventTxt,result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.talentrank.in/uploads/registrationInSelenium.html");
		driver.findElement(By.tagName("h1")).isDisplayed();
		h1Element=driver.findElement(By.tagName("h1")).getText();
		driver.findElement(By.name("name")).sendKeys("MayaSri");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).isDisplayed();
		nameTxt=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).getText();
		userName=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[1]")).isDisplayed();
		passWord=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td[1]")).isDisplayed();
		
		driver.findElement(By.name("userName")).sendKeys("Maya");
		driver.findElement(By.name("password")).sendKeys("Maya123");
		driver.findElement(By.name("re-EnterPassword")).sendKeys("Maya123");
		driver.findElement(By.name("address")).sendKeys("155th Avenue, London");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[3]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[8]/td[3]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[9]/td[3]/input")).click();
		genderTxt=driver.findElement(By.xpath("//input[@name='gender'][@value='female']")).getAttribute("value");
        eventTxt=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[8]/td[3]/input[1]")).getAttribute("value");
        driver.findElement(By.id("result")).isDisplayed();
        result=driver.findElement(By.id("result")).getText();
		System.out.println(genderTxt);
		System.out.println(eventTxt);
		System.out.println(result);
		
		
		
	}

}
