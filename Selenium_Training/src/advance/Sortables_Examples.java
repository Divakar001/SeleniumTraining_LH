package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/sortable.html");
		List<WebElement> Sortable=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement LastElement=Sortable.get(6);
		
		WebElement FirstElement=Sortable.get(0);
		Actions Act= new Actions(driver);
		Act.clickAndHold(LastElement);
		Act.moveToElement(FirstElement);
		Act.release(FirstElement);
		Act.build().perform();
		
		
		
		
		
		
	}

}
