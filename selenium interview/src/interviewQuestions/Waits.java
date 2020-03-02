package interviewQuestions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 


		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);// worst solutions
		
		/*   Implicit wait
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 * Explicit wait
		 * WebDriverWait wait=new WebDriverWait(driver, 20); 
		 * WebElement profile=wait.until(ExpectedConditions.elementToBeClickable(
		 * "xpath(or)locator)");
		 */
		/* profile.click(); */
		
		//fluent wait
		
		/*
		 * Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		 * .withTimeout(30,TimeUnit.SECONDS)
		 *  .pollingEvery(3,TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * 
		 */		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		WebElement profile=wait.until(new Function<WebDriver, WebElement>() {

			
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("xpathExpression"));
			}
		});
		profile.click();
	
	} 	

}
