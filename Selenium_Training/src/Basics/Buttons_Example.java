package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//get possition
		WebElement GetPosition=driver.findElement(By.id("position"));
		Point  XYpoint=GetPosition.getLocation();
	
		int xvalue=XYpoint.getX();
		int Yvalue=XYpoint.getY();
		
	System.out.println("X value is "+xvalue + "Y Value is "+Yvalue);
	
	//Get Color
	
	WebElement Color=driver.findElement(By.id("color"));
	String Coloroftext=Color.getCssValue("background-color");
	System.out.println(Coloroftext);
	
	
	//get Size
	WebElement Size=driver.findElement(By.id("size"));
	int height=Size.getSize().getHeight();
	int Width=Size.getSize().getWidth();
	System.out.println("Height of the button " +height+ "&Widht of the button " +Width);
	
	
	//click
	
	WebElement Click=driver.findElement(By.id("home"));
	Click.click();
	
	
	
    Thread.sleep(3000);
    
    driver.close();
    
    
	}

}
