package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendkeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.navigate().to("http://www.google.co.in");

		//WebElement textbox=driver.findElement(By.name("q"));
		//sendKeys("facebook");
		//java script executor
		//JavascriptExecutor executor=(JavascriptExecutor) driver;
		//1st way

		//executor.executeScript("document.getElementsByName('q')[0].value='mounam pesiyathey'", "");
		//2nd way
		//executor.executeScript("arguments[0].value='mounam pesiyathey'", textbox);
		//3rd way
		driver.switchTo().activeElement();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_I);

		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);	
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

	}}
