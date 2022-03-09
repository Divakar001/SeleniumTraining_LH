package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		//Entering the Email Address in the TextBox
		
		
		driver.findElement(By.id("email")).sendKeys("Testing@Gmail.com");
		
		// Append the text in the Textbox
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Testing");
		
		//Getting the textproperties in the textbox
		
		WebElement Gettext=driver.findElement(By.name("username"));
		
		String value=Gettext.getAttribute("value");
		System.out.println(value);
		
		//Clearing the Text
		WebElement Clear=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		
		Clear.clear();
		
		 
		 
		 //Checking the Enable or Disable
		 WebElement Disabled= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean enable= Disabled.isEnabled();
		
		System.out.println(enable);
		
		
	}

}
