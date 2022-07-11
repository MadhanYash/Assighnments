package mypack;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.runners.Parameterized.Parameters;

public class vowels {

	  private String input = "";
	  private String expected = "";

	  public vowels(String input, String expected) {
	    this.input = input;
	    this.expected = expected;
	  }

	  @Parameters
	  public static Collection<Object[]> makeParams() {
	    List<Object[]> result =
	        Arrays.asList(new Object[][] { 
	            
	            new Object[] { "abcd", "a" },  // <----------------- Fails
	            new Object[] { "aeiou", "aeiou" }, // <------------- Passes
	            new Object[] { "AEIOU", "AEIOU" }, // <------------- Passes
	            new Object[] { "bcdfghjklmnpqrstvwxyz", "" } // <--- Fails 
	        });

	    return result;
	  }

	public void setString1(String input2) {
		// TODO Auto-generated method stub
		
	}

	public void setString(String input2) {
		// TODO Auto-generated method stub
		
	}
}