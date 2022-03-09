package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandle_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Image.html");
		/*
		WebElement Image1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		Image1.click();
		*/
		
		
		WebElement Image2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
		//naturalwidth=0 is broken image
		if(Image2.getAttribute("naturalWidth").equals("0")){
			System.out.println("Image is broken image");
			
			
			}
		
		else {
			
			System.out.println("Image is not broken image");
		}
		
		
		
	}
		
}
		
		
	
	


