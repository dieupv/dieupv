//package oop.asg02;

import org.junit.*;
import static org.junit.Assert.*;

/**
* Unit test for BigInteger class.
*/
public class BigIntegerTest{
    public void testCreateBigIntegerFromInt(){
        BigInteger bigInt = new BigInteger(10);
        assertEquals("10", bigInt.toString());
    }
    
    public void testCreateBigIntegerFromStringWithLeadingZero(){
        BigInteger bigInt = new BigInteger("010");
        assertEquals("10", bigInt.toString());
    }
	
    public void testCreateBigIntegerFromStringWithAllZeros(){
        BigInteger bigInt = new BigInteger("000");
        assertEquals("0", bigInt.toString());
    }

   
    public void testCreateBigIntegerFromStringWithAllButUnitZeros(){
        BigInteger bigInt = new BigInteger("001");
        assertEquals("1", bigInt.toString());
    }

    
    public void testConvertToLongWhenNotOverRange(){
        BigInteger bigInt = new BigInteger("10");
        assertEquals(10L, bigInt.toLong());
    }
    
   
    public void testEquality(){
        BigInteger bigInt1 = new BigInteger(10);
        BigInteger bigInt2 = new BigInteger(10);
        BigInteger bigInt3 = new BigInteger("10");
                
        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);
    }
    
    
    public void testInequality(){
        BigInteger bigInt1 = new BigInteger(10);
        BigInteger bigInt2 = new BigInteger(12);
                
        assertFalse(bigInt1.equals(bigInt2));
    }
   
    
    public void testAdditionWithoutCarryOn(){
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111112"), sum);
    }
   

    public void testAdditionWithCarryOn(){
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("9");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111120"), sum);
    }
    
    
    public void testSubtractionWithoutCarryOn(){
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111110"), difference);
    }
    
    
    public void testSubtractionWithCarryOn(){
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("9");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111102"), difference);
    }
}