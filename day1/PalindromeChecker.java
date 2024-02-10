package week1.day1;

public class PalindromeChecker {


	  public static int reverse(int n) {
	   
	    int reversed = 0;

	    while(n > 0) {
	      
	      reversed = reversed * 10 + n % 10;

	      
	      n = n / 10;
	    }

	  
	    return reversed;
	  }

	 
	  public static boolean isPalindrome(int n) {
	   
	    int reversed = reverse(n);

	
	    return n == reversed;
	  }

	
	  public static void main(String[] args) {
	  
	    int[] inputs = {121, 12345, 67876, 1001, 54321};

	    
	    for(int input : inputs) {
	     
	      boolean result = isPalindrome(input);

	      System.out.println("Input: " + input);
	      System.out.println("Output: It is " + (result ? "a Palindrome" : "not a Palindrome"));
	      System.out.println();
	    }
	  }
	

	}


