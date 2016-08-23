package salenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\chrome driver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
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
