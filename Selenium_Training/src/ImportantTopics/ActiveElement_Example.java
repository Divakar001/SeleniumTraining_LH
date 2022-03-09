package ImportantTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement_Example {
	static WebElement q;
	
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.co.in");
		//driver.switchTo().activeElement().sendKeys("Selenium Trainings \n");
		
		
		//driver.switchTo().activeElement().sendKeys("Selenium Trainings"+Keys.ENTER);
		//driver.switchTo().activeElement().sendKeys("Selenium Trainings");
		/*
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		PageFactory.initElements(driver, ActiveElement_Example.class);
		
		q.sendKeys("Selenium Trainings \n");
		
		
		
		
		
		
		
	}

}
