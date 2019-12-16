package vannuthchhorn;

import java.util.Arrays;
import java.util.Random;

public class Lab {

	public static void main(String[] args) {
		//Initiate the array of integer with 15 elements
		int[] numbers = new int[15];
		//Assign random number between -5 to 5
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(11)-5;
		}
		//Output the array as string in the console
		System.out.println(Arrays.toString(numbers));
		System.out.println(" ");
		
		//a. find the largest number in this array
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i] ==5 ) { 
				System.out.println("Largest number in this array is: "+ numbers[i]);
			}
		}
		System.out.println(" ");
		//b. find the smallest number in this array
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i] == -5 ) { 
				System.out.println("Smallest number in this array is: "+ numbers[i]);
			}
		}
		System.out.println(" ");
		//c. Display the result of this Boolean assertion : “all numbers greater than zero”
		//d. Display the result of this Boolean assertion : “at least one number greater than zero”
		//e. Display how many numbers greater than zero or even appears in this arrays
		System.out.print("The numbers greater than zero is: ");
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i] >=0 && numbers[i] <=5) {
				System.out.print(numbers[i] + " ");
			}
			
		}
		
	}

}
