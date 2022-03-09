package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// open chrome
		//We need the URL -Google
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
       //interacting with WebElements
		
		driver.findElement(By.name("q")).sendKeys("Tcs.com"+Keys.ENTER);
		
		//driver.close();
	    Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
