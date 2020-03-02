package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("game");
Thread.sleep(5000);
List<WebElement> suggestlist=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
for (WebElement webElement : suggestlist) {
	System.out.println(webElement.getText());
	
}
	}

}
