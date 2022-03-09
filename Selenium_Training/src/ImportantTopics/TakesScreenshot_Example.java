package ImportantTopics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot_Example {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Alert.html");
/*//1st methods
		TakesScreenshot Screenshot = (TakesScreenshot) driver;
		File SourceFile=Screenshot.getScreenshotAs(OutputType.FILE);
		File DestinationFile= new File("C:\\Users\\Divakar\\OneDrive\\Documents\\New folder\\AlertScreenshot.png");
		FileHandler.copy(SourceFile, DestinationFile);
	*/	
		
		WebElement Alert1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		Alert1.click();
		
		Thread.sleep(4000);
		/*
		TakesScreenshot Screenshot = (TakesScreenshot) driver;
		File SourceFile=Screenshot.getScreenshotAs(OutputType.FILE);
		File DestinationFile= new File("C:\\Users\\Divakar\\OneDrive\\Documents\\New folder\\AlertScreenshot1.png");
		FileHandler.copy(SourceFile, DestinationFile);
		
		*/
		
		//2 methods
		Robot robot= new Robot();
		
		Dimension Screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(Screensize);
		BufferedImage source= robot.createScreenCapture(rectangle);
		File DestinationFile= new File("C:\\Users\\Divakar\\OneDrive\\Documents\\New folder\\AlertScreenshot3.png");
		ImageIO.write(source, "png", DestinationFile);
		
		
		
		
		
		
		
		
		
		
	}

}
