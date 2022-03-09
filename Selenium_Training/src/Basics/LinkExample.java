package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		
		//Go to Home Page
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		//1000 mili se = 1 SEc
		
		
	}

}
