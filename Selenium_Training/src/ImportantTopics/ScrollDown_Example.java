package ImportantTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Example {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		
		//http://www.echoecho.com/htmlforms01.htm
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.echoecho.com/htmlforms01.htm");
		
		//scroll down and scroll up for some position
		JavascriptExecutor executor= (JavascriptExecutor) driver;
	/*	executor.executeScript("window.scroll(0,450)", "");
		
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-450)", "");
		
		*/
		//scrolling down to bottom 
	/*	executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","" );
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)","");
		*/
		/*
		WebElement ScrollElement=driver.findElement(By.name("un"));
		executor.executeScript("arguments[0].scrollIntoView(true)", ScrollElement);
		Thread.sleep(3000);
		*/
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		
		
		
		
	}

}
