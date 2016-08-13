package mypackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo123 {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}
}
