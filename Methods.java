package salenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {

	
public static void main (String[] args){
	System.setProperty("webdriver.gecko.driver", "E:\\chrome driver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.google.co.in");
	String title = driver.getTitle();
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	System.out.println( title);
}
}