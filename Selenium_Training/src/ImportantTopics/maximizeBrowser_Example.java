package ImportantTopics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maximizeBrowser_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		/*
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/sortable.html");
		//1st method
		//driver.manage().window().maximize();
		
		
		//2nd method
		Dimension dimension=new Dimension(1920,1080);
		driver.manage().window().setSize(dimension);
		
		*/
		//3 method
		
		
		ChromeOptions chromeoption=new ChromeOptions();
		
		chromeoption.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeoption); 
		driver.get("http://leafground.com/pages/sortable.html");
		
		
		//Thread.sleep(4000);
	}

}
