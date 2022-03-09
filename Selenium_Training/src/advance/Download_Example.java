package advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement Download=driver.findElement(By.linkText("Download Excel"));
		Download.click();
		
		//Java
		Thread.sleep(3000);
		File FileLocation= new File("C:\\Users\\Divakar\\Downloads");
		
		File[] Totalfile=FileLocation.listFiles();
		for (File file : Totalfile) {
			
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("file got Downloaded Successfully");
			    break;
			
			
			
			
		}
		
				
		}		//testleaf (1)
		
		
	}
	}
