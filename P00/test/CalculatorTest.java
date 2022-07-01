import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAdd() {
		//Arrange
		int a=4321;
		int b=1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual=cal.add(a,b);
		
		//Assert
		int expected=5555;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSubtract() {
		//Arrange
		int a=4321;
		int b=1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual=cal.subtract(a,b);
		
		//Assert
		int expected=3087;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMultiply() {
		//Arrange
		int a=10;
		int b=10;		
		Calculator cal = new Calculator();
		
		//Act
		int actual=cal.multiply(a,b);
		
		//Assert
		int expected=100;
		assertEquals(expected,actual);
	}
	
	@Test
//	public void testDivide() {
//		//Arrange
//		int a=10;
//		int b=2;		
//		Calculator cal = new Calculator();
//		
//		//Act
//		int actual=cal.divide(a,b);
//		
//		//Assert
//		int expected=5;
//		assertEquals(expected,actual);
//	}
	
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented")
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a,c);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported",e.getMessage());
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

	@After
	public void tearDown() throws Exception {
	}



}
