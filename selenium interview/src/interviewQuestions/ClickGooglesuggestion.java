package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGooglesuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("game");
		Thread.sleep(5000);
		List<WebElement> suggestlist=driver.findElements(By
				.xpath("//ul[@role='listbox']//following::li"));
		
		
		int position=0;
		
	for (WebElement webElement : suggestlist) {
			
			String text=webElement.getText();
			System.out.println(text);
		if(text.contains("loop")) {
			webElement.click();
			break;
		}
			
			//position++; 
			
			/*
			 * if(position==3) { webElement.click(); }
			 */

		}
	}


}


