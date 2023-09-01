
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestEmployeeLogic.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
		
	}
}
