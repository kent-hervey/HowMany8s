package com.hervey.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class OccuranceTests {

	@Test 
	public void checkAValidRoomQuantityPositive() { //room quantities must be positive
		//fail(); //next step because we need to confirm failure
		int testNegateInput =-1;
		//System.out.println("should be minus 100  " + Occurance.countEights(-1));
		assertTrue("confirming positive only", Occurance.countEights(testNegateInput)<0);  //method returns a negative number when negative room quantities are input
		
	}
}
