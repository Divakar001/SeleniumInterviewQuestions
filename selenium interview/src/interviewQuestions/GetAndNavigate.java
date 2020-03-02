package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//get
        //driver.get("http://www.google.co.in");
       
		//navigate
		driver.navigate().to("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
       
		/*
		 * difference
		 * 
		 * 1.get will not store the history but navigate does 
		 * 2.get will wait until the page loads but the navigate will not
		 */

	}

}
