import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import C206_L06_P00.Calculator;

public class CalculatorTest {
	private int a,b;
	Calculator cal = new Calculator();
	@Before
	public void setUp() throws Exception{
		//code tested before each test method
		 a = 4321;
		 b = 1234;
		 Calculator cal= new Calculator();
	}
	@Test
	public void testAdd() {
		//Act
		int actual = cal.add(a, b); 
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);

	}
	@Test
	public void testSubtract() {
		//Act
		int act = cal.subtract(a, b);
		//Assert
		int ex= 3087;
		assertEquals(ex, act);
		
	}
	@Test
	public void testMultiply() {
		//Act
		int act1= cal.multiply(a, b);
		int ex1= 5332114;
		//Assert
		assertEquals(ex1,act1);
	}
	
	@Test
	public  void testDivide() {
		//Act
		int act2= cal.divide(a, b);
		/*if(b!=0) {
			System.out.println(act2);
		}
		else {
			System.out.println("Cannot divide by 0! ");
		}*/
		try {
			act2=cal.divide(a, b);
		}
		catch(ArithmeticException ae) {
			System.out.println("Numbers cannot be divided by 0! ");
		}
		int ex2 = 3;
		//Assert
		assertEquals(ex2,act2);
	}
	
	@After
	public void tearDown() throws Exception {
		//code tested after each test method
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}