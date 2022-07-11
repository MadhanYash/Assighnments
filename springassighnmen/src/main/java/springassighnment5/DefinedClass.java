package springassighnment5;
public class DefinedClass implements Number1{


	public void method(int[] a) {
		
		  int maxNum = a[0];

		    for (int j : a) {
		        if (j > maxNum)
		            maxNum = j;
		    }

System.out.println("Maximum number = " + maxNum);
		}
		
	
	
	}
