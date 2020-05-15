package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
public static void main(String[] args ) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWinter2020\\LaunchBrowser\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.google.com/");
	//driver.get("https://www.selenium.dev/");
	//driver.manage().window().maximize();
	//Thread.sleep(2000);
	//driver.close();
	
	
	
	
	
     }
}