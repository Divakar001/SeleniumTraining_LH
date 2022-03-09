package advance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

      //Doing some action in child window
		String ParentWindow=driver.getWindowHandle();

		WebElement FirstButton	=driver.findElement(By.id("home"));

		FirstButton.click();
		Set<String>handles=driver.getWindowHandles();
		for (String newwindow : handles) {


			driver.switchTo().window(newwindow);
		}
         Thread.sleep(3000);
         
         //No of Windows Opened
		WebElement  EditBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"))	;
		EditBox.click();
		
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(ParentWindow);
		
		//Closing the windows Apart from Parent windows

		WebElement  EditBox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));

		EditBox2.click();
		Thread.sleep(3000);
		int NoofWindows=driver.getWindowHandles().size();
		System.out.println("Number of Windows Got Opened "+NoofWindows);
		Thread.sleep(3000);

		WebElement ThirdButton=driver.findElement(By.id("color"));
		ThirdButton.click();

		Set<String>handles1=driver.getWindowHandles();

		for (String ChildWindow : handles1) {

			if(!ChildWindow.equals(ParentWindow))
				driver.switchTo().window(ChildWindow);
			driver.close();

		

		}











	}

}
