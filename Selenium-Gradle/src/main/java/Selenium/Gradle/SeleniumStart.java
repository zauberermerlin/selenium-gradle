package Selenium.Gradle;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver webDriver = new FirefoxDriver();
		
		 try {
			webDriver.navigate().to(new URL("https://www.google.com"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
