package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		
	    WebElement tooltip =driver.findElement(By.id("age"));
	    
	    String ToolTipName=tooltip.getAttribute("title");
	    System.out.println(ToolTipName);
	    
		
		
	}

}
