package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms01.htm");
		
		//scroll down and up to some position
		
		//JavascriptExecutor executor= (JavascriptExecutor) driver;
		/*executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-450)", "");*/
		
		//scroll down to bottom
		
		/*executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)","");*/
		
		//go to specific element
		
		//WebElement element=driver.findElement(By.
			//	xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/input"));
		//executor.executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_PAGE_UP);
	    robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		
	}

}
