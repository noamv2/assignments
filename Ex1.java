package homework;
import java.util.Scanner;

public class Ex1 {

	
	public static void main(String[] args) {
		
		int a = 0, b =0;
		if(args.length > 1) {//the user inserted at least 2 arguments via the command line
			
			 a = Integer.parseInt(args[0]);
			 b = Integer.parseInt(args[1]);
		}
		else {//ask for 2 numbers from the user - works when the user inserted less then 2 
												//numbers from the terminal
			Scanner sc = new Scanner(System.in);
			System.out.println("Insert the first number: ");
			a = sc.nextInt();
			System.out.println("Insert the second number: ");
			b = sc.nextInt();
			System.out.println("Your numbers are: " + a +" and " + b);
			sc.close();
		}
		
		/*the GCD can't be higher then the smallest number
		 * Therefore, we can sort the numbers to make the
		 * program more efficient
		 */
		int min = Math.min(a, b);
		int max = Math.max(a, b);

		for(int i = min; i >= 1; i-- ) {//checking all the numbers from min to 2
			
			if(min % i == 0 & max % i ==0) {//i is a common divisor
				
				for(int j = 2;  j<=i ; j++) {//checking the range(2 to i-1)
			
					if(j == i) {//i isn't divisible by any number other then itself and 1
						System.out.println(i + " is the greatest prime common divisor");
						return;
					}
					if(i % j == 0)break;//i isn't prime
					
				}//inner for
			}//if
			
			
		}//outer for
		System.out.println("the numbers dont have a prime GCD");
		
	}//end of main
	
}//end of Ex1
