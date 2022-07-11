package mypack;
public class stringpalindrome {

    public static void main(String[] args) {

    	stringpalindrome palindrome = new stringpalindrome();

        String input = "Poor Dan is in a droop";

        if (palindrome.isPalindrome(input))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");

    }

    public boolean isPalindrome(String input) {

        
        input = input.toLowerCase().replaceAll("\\s+", "");

      
        int length = input.length();

        
        if (!input.matches("^([a-z0-9]+)?$")) {
            return false;
        }

        
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
   