import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AverageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAverage() {
		//Arrange
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		Average cal = new Average();
		
		//Act
		int actual=cal.average(a,b,c,d,e);
		
		//Assert
		int expected=3;
		assertEquals(expected,actual);
	}

}
