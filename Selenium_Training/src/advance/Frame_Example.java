package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		//Swith the Frame and Click the Button
		driver.switchTo().frame(0);
		WebElement Button1=driver.findElement(By.id("Click"));
		Button1.click();
		String ButtonText=Button1.getText();
		
		System.out.println(ButtonText);
		
		//Click the Element under the nested
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement Button2=driver.findElement(By.id("Click1"));
		
		Button2.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	//finding the number of frames
		
		
		List<WebElement>noofFrame= driver.findElements(By.tagName("iframe"));
		int NoofFrmes=noofFrame.size();
		
		System.out.println("No of Frames "+NoofFrmes);
	
		
		
		
		
		
	}

}
