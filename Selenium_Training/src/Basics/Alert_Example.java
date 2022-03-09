package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");


		WebElement AlertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBox.click();

		Thread.sleep(4000);
		
		Alert firstalert=driver.switchTo().alert();
		firstalert.accept();

		Thread.sleep(3000);

		WebElement AlertBox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		AlertBox2.click();
		Alert Secondalert2=driver.switchTo().alert();
		Secondalert2.dismiss();
		Thread.sleep(3000);

		WebElement AlertBox3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		AlertBox3.click();
		Alert Secondalert3=driver.switchTo().alert();
		Secondalert3.sendKeys("Selenium");
		Secondalert3.accept();
        Thread.sleep(3000);
				
				
			
	}

}
