package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement {
	//static WebElement q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://WWW.GOOGLE.CO.IN");
driver.switchTo().activeElement().sendKeys("mounam pesiyathey \n");

//PageFactory.initElements(driver, ActiveElement.class);

//q.sendKeys("mounam pesiyathey \n");
	}

} 
