package ImportantTopics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsConcept_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	To Overcome the Disadvangate of Thread.sleep(e);	
	Selenium intros Wait concept as Threes Types
1. Implicit Wait
2. Explicit Wait
3 Fluent Wait


		
		
	//1.Implicit Wait
	WebDriver driver=new ChromeDriver();
	
\

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//2. Explicit Wait
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement WaitConcept=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Path")));
	WaitConcept.click();
	
	
\
	//NoSuchElement
	//ElementtoClickable
//3. Fluent Wait
	
	
\
	WebElement element = driver.findElement(By.xpath("Path"));
	Wait<WebDriver> Wait= new FluentWait<WebDriver>(driver)
			.withTimeout(30 , TimeUnit.SECONDS)
			.pollingEvery(3, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);

	element.click();
	
	*
	*
	
	Wait<WebDriver> Wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	WebElement Element=Wait.until(new Function<WebDriver, WebElement>(){
		
		public WebElement apply(WebDriver driver) {
			
			
			return driver.findElement(By.name("Selenium"));
			
			Element.click();
			
		});
	
	
	*/

		
		
	}
}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
