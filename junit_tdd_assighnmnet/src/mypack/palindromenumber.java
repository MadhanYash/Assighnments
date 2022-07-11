package mypack;

public class palindromenumber {
  public static boolean checkpalindrome(int number) {
	  int rem,sum=0,temp;
	  temp=number;
	  while(number>0) {
		  rem=number%10;
		  sum=(sum*10)+rem;
		  number=number/10;
	  }
	  if (temp==sum) {
		  System.out.println(temp+"is a palindrome number");
		  return true;}
	  else
	  {
		  System.out.println(temp+"is not a palindrome number");
		  return false;
	  }
	  }
  }
	 