package JUnitInterest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//import static org.JUnitInterest.Assert.assertTrue;
//import static org.JUnitInterest.jupiter.api.Assertions.*;



public class JUnitInterestTest {
	
	public float x;
	public float y;
	@Test
	public void test_simpleInterest()
	{
		//x=JUnitInterest.simpleInterest();
		x=JUnitInterest.simpleInterest();
		assertTrue(x>500);
	
	}
	@Test
	public void testingHelloWorld() {
		assertEquals("Hello + World", JUnitInterest.helloWorld());
	}
}
