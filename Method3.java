package salenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method3 {

	
public static void main (String[] args){
	System.setProperty("webdriver.gecko.driver", "E:\\chrome driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.gmail.com");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.findElement(By.id("Email")).sendKeys("India");
	driver.findElement(By.id("next")).click();
	boolean a = driver.findElement(By.id("next")).isEnabled();
	System.out.println(a);
}
}