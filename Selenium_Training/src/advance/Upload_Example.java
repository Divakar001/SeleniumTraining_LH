package advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Example {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/upload.html");
		
		Actions Click=new Actions(driver);
		WebElement UploadButton=driver.findElement(By.name("filename"));
		
		Click.moveToElement(UploadButton).click().build().perform();
		
		Thread.sleep(3000);
		String File= "C:\\Users\\Divakar\\Downloads\\testleaf.xlsx";
		
		StringSelection Selection=new StringSelection(File);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
	}

}
