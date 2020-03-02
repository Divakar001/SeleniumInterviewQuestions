package interviewQuestions;

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

public class TakesScreenShots {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		/*
		 * 
		 * first method -takes screenshots
		 */ 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html"); 
		TakesScreenshot screenshots=(TakesScreenshot) driver; 
		File sourcefile=screenshots.getScreenshotAs(OutputType.FILE); 
		File destinationfile=new File("C:\\Users\\Divakar\\Downloads\\sample3.png");
		FileHandler.copy(sourcefile, destinationfile);

		/*

		 * WebDriver driver=new ChromeDriver();
		 * driver.get("http://leafground.com/pages/Alert.html"); 
		 * //alert ok 
		 * WebElement alertbox=driver.findElement(By.xpath(
		 * "//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		 * alertbox.click(); 
		 * Thread.sleep(5000);
		 * 
		 * // 2nd method -using robot 
		 * Robot robot=new Robot(); 
		 * Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize(); 
		 * Rectangle rectangle= new Rectangle(screensize);
		 *  BufferedImage source=robot.createScreenCapture(rectangle); 
		 *  File destinationfile=new File("C:\\Users\\Divakar\\Downloads\\sample1.png");
		 *  ImageIO.write(source,"png", destinationfile);
		 */

	}

}	
