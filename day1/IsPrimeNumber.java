package week1.day1;

public class IsPrimeNumber {

public static void main(String[] args) {
 
 int number = 6;

 boolean isPrime = true;


 for (int i = 2; i <= number / 2; i++) {
   
   if (number % i == 0) {
    
     isPrime = false;
     break;
   }
 }


 if (isPrime) {

   System.out.println("The number is prime");
 } else {
  
   System.out.println("The number is not prime");
 }
}
}
