import java.util.ArrayList;
import java.util.HashSet;

public class employeeuniquename {
		  
	    public static void main(String[] args)
	    {
	  
	        ArrayList<String> ArrList = new ArrayList<String>();
	  
	        ArrList.add("nani");
	        ArrList.add("hemu");
	        ArrList.add("pooji");
	        ArrList.add("hemu");
	        ArrList.add("vrh");
	        ArrList.add("nothing");
	        ArrList.add("nani");
	  
	       System.out.println("Original ArrayList is : "+ ArrList);
	  
	        HashSet<String> hset = new HashSet<String>(ArrList);
	  
	         System.out.println("ArrayList Unique Values is : "+ hset);
	    }
	}


