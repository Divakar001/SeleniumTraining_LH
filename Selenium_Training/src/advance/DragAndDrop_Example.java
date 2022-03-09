package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		
		Actions Action=new Actions(driver);
		// method 1
	
		////Action.clickAndHold(source).moveToElement(Target).build().perform();
		
		
		
		//method2
		
		Action.dragAndDrop(source, Target).build().perform();
		
		driver.close();
		
		
		
		
	}

}
