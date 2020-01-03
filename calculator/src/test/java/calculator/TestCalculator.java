package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	private static Calculator calculator;
	@Test
	public void testmax1() {
		calculator=new Calculator();
		assertEquals(4,calculator.findMax(1,3,4)); 
	   }
	@Test
	public void testmax2() {
		calculator=new Calculator();  
		assertEquals(0,calculator.findMax(-12,-1,-2));  
	   }
	@Test
	public void testmax3() {
		calculator=new Calculator();
		assertEquals(0,calculator.findMax(0,-1,-100));    
	   }
	@Test  
	public void testSquare1(){ 
		calculator=new Calculator();
	 assertEquals(9,calculator.square(3));  
	   }
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){
		calculator=new Calculator();
		calculator.square(-1);  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare3(){ 
		calculator=new Calculator();
		calculator.square(0); 
     }
	@Test
	public void testcube1() {
		calculator=new Calculator();
		assertEquals(27,calculator.cube(3)); 
	}
	@Test
	public void testcube2() {
		calculator=new Calculator();
		assertEquals(-8,calculator.cube(-2)); 
	}
	@Test
	public void testcube3() {
		calculator=new Calculator();
		assertEquals(0,calculator.cube(0)); 
	}
}
