import static org.junit.Assert.*;

import org.junit.Test;

public class CitySim9002Test {

	//This test is checking that the random number generator that takes in a single variable 
	//does not return the value of 0 which would break the program
	@Test
	public void zeroTest() {
		RandomNumberGenerator n = new RandomNumberGenerator();
		
		int tester = n.generator(4);
		assertNotEquals(0,tester);
	}
	
	//This test is checking that the random number generator that takes in two variables 
	//does not return the value of 0 which would break the program
	
	@Test
	public void doubleZeroTest() {
		RandomNumberGenerator n = new RandomNumberGenerator();
		
		int tester = n.generator(4,4);
		assertNotEquals(0,tester);
	}

}
