package week1.day1;

public class FindingMissingElement {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 8, 6, 7};
		
		int sum = 0;
	    for(int num : arr) {
	      sum += num;
	    }
		int n = arr.length + 1;
		
	    int expectedSum = n * (n + 1) / 2;
	    
	    int missing = expectedSum - sum;
	    System.out.println("Missing Number: " + missing);

	}

}
