package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitandClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		WebElement home=driver.findElement(By.id("home"));
		home.click();
		
		driver.close();//close the window browser that driver(not user) focus on 
	
		driver.quit();//closes the all the window that programs has opened
		
		

	}

}
