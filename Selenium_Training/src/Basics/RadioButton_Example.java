package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement Radiobtn1=driver.findElement(By.id("yes"));
		
		Radiobtn1.click();
		
		//is selected or not
		WebElement radiobtn2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		WebElement radiobtn3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		
		boolean Status1=radiobtn2.isSelected();
		boolean Status2=radiobtn3.isSelected();
		
		
		System.out.println(Status1);
		System.out.println(Status2);
		
		
	}

}
