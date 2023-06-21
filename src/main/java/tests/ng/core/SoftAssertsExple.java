package tests.ng.core;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsExple {
	
	
	/**
	 * Assert              						Vs   		SoftAssert
	 * 
	 * If a assert FAILS then remaining						If assert fails still it can be executed remain statements successfully
	 * statements wont be executing in class
	 * 
	 * All methods are STATIC									All methods are NON - STATIC
	 * 
	 * We don't call assertALL methods			We usually calls AssertAll method in Soft Assertions							
	 */
	
	
	
	@Test
	public void softAssertingExample() {
		
		SoftAssert a=new SoftAssert();
		Reporter.log("Step1", true);
		
		Reporter.log("Step2",true);
		a.assertAll();
		a.assertEquals("ab", "Bc");
		
		Reporter.log("Step3",true);
		
		
		
	}

}
