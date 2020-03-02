package interviewQuestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimesOutExample {
	
	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	public void test() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Mounam pesiyathey");
	}

}
