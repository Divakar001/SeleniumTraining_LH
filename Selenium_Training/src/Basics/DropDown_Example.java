package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement DropDown1=driver.findElement(By.id("dropdown1"));
		Select select= new Select(DropDown1);
		
		//Select By Index
		//select.selectByIndex(1);
		
		//Thread.sleep(4000);
		
		//driver.close();
		
		//Select By Visible Text
		
		//select.selectByVisibleText("Appium");
		
		//Thread.sleep(4000);
		
		//select.selectByValue("3");
		/*
		Thread.sleep(4000);
		
		List<WebElement> ListofOption=select.getOptions();
		int options=ListofOption.size();
		//to get the number of values under the dropdown
		System.out.println(options);
		
		DropDown1.sendKeys("Selenium");
		*/
		WebElement Multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select1= new Select(Multiselect);
		
		
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.selectByIndex(3);
		
		
		
		
		
		
		
	}

}
