package selprac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_1 {
	public static Boolean firstDivPresent,secondDivPresent,thirdDivPresent;
	public static String firstDivElementText,secondDivElementText,thirdDivElementText;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.e-box.co.in/uploads/Eventsforce.html");
		firstDivPresent=driver.findElement(By.id("firstDiv")).isDisplayed();
		firstDivElementText=driver.findElement(By.id("firstDiv")).getText();
		secondDivPresent=driver.findElement(By.id("secondDiv")).isDisplayed();
		secondDivElementText=driver.findElement(By.id("secondDiv")).getText();
		thirdDivPresent=driver.findElement(By.id("thirdDiv")).isDisplayed();
		thirdDivElementText=driver.findElement(By.id("thirdDiv")).getText();

	}

}
