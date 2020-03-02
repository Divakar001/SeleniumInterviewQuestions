package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshCommand {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.navigate().to("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("facebook");
      
        //1.refresh command
       // driver.navigate().refresh();
		
		//2.get current url
        
        //driver.get(driver.getCurrentUrl());
		
        
        //3.java script executor to refresh
        
        //JavascriptExecutor executor=(JavascriptExecutor) driver;
		
	//	executor.executeScript("location.reload()"); //or history,go(0)
        
       // 4.using Robot
        
        Robot robot=new Robot();
        
       robot.keyPress(KeyEvent.VK_F5);
       robot.keyRelease(KeyEvent.VK_F5);
		
	}

}
