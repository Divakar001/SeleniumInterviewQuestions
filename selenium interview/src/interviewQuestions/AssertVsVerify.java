package interviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	/*@Test	
	public void AssertTest() {
		System.out.println("before assertion");
		Assert.assertEquals(true, false);
		System.out.println("after assertion");
	}*/

	@Test
	public void testVerify() {
		//soft assertions is called as verify
		SoftAssert assert1=new SoftAssert();
		System.out.println("before assertion");
		assert1.fail();
		System.out.println("after assertion");

	}

}
