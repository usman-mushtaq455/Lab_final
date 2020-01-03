package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

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
	assertEquals(-1,calculator.findMax(-12,-1,-2));  
   }
@Test
public void testmax3() {
	calculator=new Calculator();
	assertEquals(0,calculator.findMax(0,-1,-100));    
   }
@Test  
public void testSquare1(){  
 assertEquals(9,calculator.square(3));  
   }
@Test (expected = IllegalArgumentException.class) 
public void testSquare2(){  
	calculator.square(-1);  
}
@Test (expected = IllegalArgumentException.class) 
public void testSquare3(){  
	calculator.square(0);  
}



}
