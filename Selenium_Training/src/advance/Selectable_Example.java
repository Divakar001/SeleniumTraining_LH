package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		
		List <WebElement>Selectable=	driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int noofOptions=Selectable.size();
		System.out.println(noofOptions);
//		List <WebElement>Selectable=driver.findElements(By.xpath("//*[@id='selectable']/li]"));
//		int noofOptions=Selectable.size();
//		System.out.println(noofOptions);
//		//method 1
		
		
		/*
		Actions actions= new Actions(driver);
		
			actions.keyDown(Keys.CONTROL).click(Selectable.get(0))
			.click(Selectable.get(1)).
			 click(Selectable.get(2)).build().perform();
			Thread.sleep(3000);
			driver.close();
			*/
			
			//method2
			Actions actions1= new Actions(driver);
			
			actions1.clickAndHold(Selectable.get(0));
			actions1.clickAndHold(Selectable.get(1));
			actions1.clickAndHold(Selectable.get(2));
			actions1.build().perform();
			
		
		
		
		
		
	}

}
