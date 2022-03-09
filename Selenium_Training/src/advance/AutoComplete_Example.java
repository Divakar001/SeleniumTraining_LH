package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/autoComplete.html");
		WebElement TextBox=driver.findElement(By.id("tags"));
		
		TextBox.sendKeys("S");
		
		Thread.sleep(4000);
		List<WebElement>optionAvailable=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int Options=optionAvailable.size();
		System.out.println(Options);
		
		for (WebElement webElement : optionAvailable) {
			if(webElement.getText().equals("SOAP")) {
				webElement.click();
				break;
				
				
				
			}
		}
	}

}
