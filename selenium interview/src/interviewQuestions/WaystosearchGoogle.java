package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaystosearchGoogle {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		//1st way
		//searchbox.sendKeys("mounam pesiyathey"+Keys.ENTER);
		//2nd way
		//searchbox.sendKeys("mounam pesiyathey");
		//searchbox.submit();
		//3rd way robot
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		4th way 
		searchbox.sendKeys("mounam pesiyathey \n");
	}

}
