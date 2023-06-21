package tests.ng.core;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemoDependsOnMethods {
	
	
	
	
	@Test(priority = 2)
	public void createUser() {
		
		Reporter.log("Creating user", true);
		//Assert.fail(); // We fail the scripts intentionally 
		
	}
	
	@Test(priority = 1, dependsOnMethods = "createUser")
	public void deleteUser() {
		
		Reporter.log("Deleting the user", true);
		
	}

}
