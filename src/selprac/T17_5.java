package selprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_5 {
	public static String rudolfinumHall;
	public static String CarnegieHall;
	public static String CadoganHall;
	public static String QueenElizabethHall;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.talentrank.in/uploads/index_10552.html");
		driver.findElement(By.id("200-500")).click();
		driver.findElement(By.id("filter")).click();
		driver.findElement(By.id("london")).click();
		driver.findElement(By.id("new_york")).click();
		driver.findElement(By.id("filter")).click();
		driver.navigate().refresh();
		rudolfinumHall=driver.findElement(By.xpath("//*[@id=\"Cassandra\"]/div[2]")).getText();
		CarnegieHall=driver.findElement(By.xpath("//*[@id=\"John\"]/div[2]")).getText();
		CadoganHall=driver.findElement(By.xpath("//*[@id=\"Sophia\"]/div[2]")).getText();
		QueenElizabethHall=driver.findElement(By.xpath("//*[@id=\"Emma\"]/div[2]")).getText();
				

	}

}
