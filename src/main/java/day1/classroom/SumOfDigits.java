package day1.classroom;

public class SumOfDigits {

	
	public static void main(String[] args) {
         int n=123,sum=0,a;
         
        	 while(n > 0)
        	 {
        		 a = n%10;
        		 sum = sum + a;
        		 n= n/10;
        		 
        	 }
        	 System.out.println(sum);
         }
         
		// Declare your input number (int)

		// Initialize an integer variable by name: sum

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??

		// Within loop: get the remainder when done by 10 -> Tip: use mod

			// Print the remainder to confirm
	
			// Within loop: add that remainder to the sum
	
			// Print the sum to confirm
	
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	
			// Print the quotient to confirm
		
		// Outside the loop: print the final sum
	}


