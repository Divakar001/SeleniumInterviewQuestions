package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckallcheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/checkbox.html");
List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));

for (WebElement webElement : checkbox) {
	webElement.click();
	
	
}

}}

