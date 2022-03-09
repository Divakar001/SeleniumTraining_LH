package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
		//Select the Language
		
		Thread.sleep(3000);
		
		WebElement CheckBox1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		//*[@id="contentblock"]/section/div[1]/div[1]/input
		CheckBox1.click();
		
		//Confirm whether is got selected
		
		WebElement CheckBox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		
		boolean Status=CheckBox2.isSelected();
		System.out.println(Status);	
		
		
		//Deselect the Selected one
		
		WebElement CheckBox3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		WebElement CheckBox4=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		
		
		if(CheckBox3.isSelected()) {
			CheckBox3.click();

		}
		if (CheckBox4.isSelected()) {
			CheckBox4.click();


		}
	}
}