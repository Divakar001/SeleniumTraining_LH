package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.navigate().to("http://leafground.com/pages/Link.html");
		WebElement Link=driver.findElement(By.linkText("Go to Home Page"));

		Link.click();
		
		driver.navigate().back();
		WebElement Link2=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		
		String WOClicking =Link2.getAttribute("href");
		
		System.out.println("This link going to "+WOClicking);
		
		WebElement Link3=driver.findElement(By.linkText("Verify am I broken?"));
		
		Link3.click();
		
		
		String TileoftheBrokenImage=driver.getTitle();
		if (TileoftheBrokenImage.contains("404")) {
			
			System.out.println("Link is Broken");
		}
		else
		{
			System.out.println("Link is not Broken");
			
		}
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement Link6=driver.findElement(By.linkText("Go to Home Page"));

		Link6.click();
		driver.navigate().back();
		
		
		
		
		
		
		List<WebElement> nooflinks=driver.findElements(By.tagName("a"));
		int Countlink=nooflinks.size();
		System.out.println("Count of the link is "+Countlink);
		
		
		
		
	}

}
