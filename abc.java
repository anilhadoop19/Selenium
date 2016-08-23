package salenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class abc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	/*System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");*/
	String url = driver.getCurrentUrl();
	if (url.equals("http://www.gcrit.com/build3/admin/login.php")){
		System.out.println("login-success");
	}
	else{
		System.out.println("fail");
	}
	driver.close();
	}

}
