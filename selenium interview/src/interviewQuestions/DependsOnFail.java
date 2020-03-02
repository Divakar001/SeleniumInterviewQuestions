package interviewQuestions;

import org.testng.annotations.Test;

public class DependsOnFail {
	@Test(timeOut = 2000)
	public void parentspermission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("permission granted");
		
	}
	
	@Test(dependsOnMethods = "parentspermission",alwaysRun = true)
	public void goingToMovie() {
		System.out.println("went movie");
	}
	
	
	

}
