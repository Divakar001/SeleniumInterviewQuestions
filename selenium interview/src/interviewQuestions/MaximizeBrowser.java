package interviewQuestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		 
		//1.default maximize method
		
		//driver.manage().window().maximize();
		
		//2.set size to windows
		//Dimension dimension=new Dimension(1440,900);
		//driver.manage().window().setSize(dimension);
		//driver.get("https://www.google.co.in");
		
		///3.using chrome options
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
				driver.get("https://www.google.co.in");
				
	}

}
