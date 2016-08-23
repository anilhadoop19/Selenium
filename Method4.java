package salenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method4 {

	
public static void main (String[] args){
	System.setProperty("webdriver.gecko.driver", "E:\\chrome driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("");
}
}