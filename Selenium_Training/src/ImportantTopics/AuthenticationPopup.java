package ImportantTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// Example https://username:password@dot.com	
		
		
	}

}
