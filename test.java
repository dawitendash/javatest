package test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testclass.calculator;

public class test {
   @Test
   public void additiontest() {
	   int a=10,b=10;
	   calculator cal= new calculator();
	   int result=cal.add(a,b);

	   Assertions.assertEquals(20,result ,  "failed");
  
   }
   @Test
   public void subtest() {
	   int a=10,b=10;
	   calculator cal= new calculator();
	   int result=cal.sub(a,b);

	   Assertions.assertEquals(0,result ,  "failed");
   }
   @Test
   public void multest() {
	   int a=10,b=10;
	   calculator cal= new calculator();
	   int result=cal.mul(a,b);

	   Assertions.assertFalse(result!=100); 
   }
   @Test
   public void divtest() 
   {
	   int a=10,b=10;
	   calculator cal= new calculator();
	   int result=cal.div(a,b);

	   Assertions.assertTrue(1==result);
	   
   }
   @Test
   public void arrayadd() 
   {
	    
	   calculator cal= new calculator();
	   int []num= new int[] {1,2,3,4,5};
	   int result=cal.addarray(num);

	   Assertions.assertEquals(15,result);
	   
   }
   @Test
   public void arrayequality() 
   {
	    
	  // calculator cal= new calculator();
	   int []num1=  {1,2,3,4,5};
	   int []num2=  {1,2,3,4,5};
	   Assertions.assertEquals(num1.length,num2.length);
	   
   }
   @ParameterizedTest
   @ValueSource(strings ={"japan","ethiopia","usa"})
   public void getcapitaltest(String country) {
	   calculator cal= new calculator();
	   Assertions.assertNotNull(cal.getcapital(country),"sdssss"); 
   }

}
