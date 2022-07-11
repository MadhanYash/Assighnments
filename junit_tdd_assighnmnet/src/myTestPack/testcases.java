package myTestPack;

import org.junit.jupiter.api.assertThrows;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.internal.Checks;

import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.Test;
import mypack.palindromenumber;
import mypack.Student;
import mypack.amstrongnumber;
import mypack.evenorodd;
import mypack.hcf;
import mypack.pythogores;
import mypack.reversestring;
import mypack.singelton;
import mypack.vowels;
import mypack.stringpalindrome;

class testcases {

	@Test
	void test1() {
		reversestring as=new reversestring();
		assertEquals("qwerREWHELLO",as.simbleremove("qwer@#$%REWHELLO"));
	}
	 @Test
	    public void check() {
	        amstrongnumber checker = new amstrongnumber();
	        assertThat(checker.check(153), equalTo(true));
	        assertThat(checker.check(370), equalTo(true));
	        assertThat(checker.check(371), equalTo(true));
	        assertThat(checker.check(407), equalTo(true));
	        assertThat(checker.check(8208), equalTo(true));
	    }
	 @Test
	    public void TestSingletonObject(){

	        singelton instance1 = singelton.INSTANCE;
	        singelton instance2 = singelton.INSTANCE;
	        //Passes
	        Assert.assertSame("2 objects are same", instance1, instance2);
	    }
	 static int[] p1={3,4,5};
	    static int[] p2={3,5,7};
	   
	    pythogores pT = new pythogores();

	    @Test
	    public void validTriple() {
	        assertEquals(1, pT.pythagoreanTriple(p1));
	    }
	    
	    @Test
	    public void invalidTriple(){
	      assertEquals(0,pT.pythagoreanTriple(p2));
	    }
	    @Test
	    public void testEvenOrOdd() {
	    	evenorodd eoo = new evenorodd();
	        assertEquals(eoo.even_or_odd(6), "Even");
	        assertEquals(eoo.even_or_odd(7), "Odd");       
	    }
	    @Test
	    public void testValidVowels() throws Exception {
	      vowels ms = new vowels(input, input);
	      ms.setString(input);
	      Object[] expected;
		
	    }
	  
	
	    private stringpalindrome stringpalindrome;
	    private String input;

	    @Before
	    public void setUp() throws Exception {

	        input = null;
	        stringpalindrome = new stringpalindrome();

	    }

	    @After
	    public void tearDown() throws Exception {

	    }

	    @Test
	   
	    public void nullStringTest() throws Exception {
	    	
	    	stringpalindrome sp = new stringpalindrome();
	    	 assertThat(sp.isPalindrome("madam"), equalTo(true));
	    }
       @Test
        public void palindromenumber() {
    	   assertEquals(true,mypack.palindromenumber.checkpalindrome(11));
       }

       
       @Test
       void Hcf() {
    	   hcf as=new hcf();
    	   assertEquals(10,hcf.Hcf(100,10));
    	   
       }
       @Test
       void test()throws CloneNotSupportedException{
    	   mypack.clone s1=new mypack.clone(1,"madhan");
    	   mypack.clone s2=(mypack.clone)s1.clone();
    	   assertEquals(true,mypack.clone.checkclone(s1, s2));
       }
}
       






