package salenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods2 {

	
public static void main (String[] args){
	System.setProperty("webdriver.gecko.driver", "E:\\chrome driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.google.co.in");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.navigate().to("https://login.yahoo.com/");
	URL = driver.getCurrentUrl();
	System.out.println(URL);
	driver.navigate().back();
	URL = driver.getCurrentUrl();
	System.out.println(URL);
}
}