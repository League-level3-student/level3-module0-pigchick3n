package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
	int smallest;
	int largest;
		//1. make an array of 5 Strings
		String[] strings = {"string1","string2","string3","string4","string5"};
		//2. print the third element in the array
		
			System.out.println(strings[2]);
			
		
		//3. set the third element to a different value
		strings[2] = "SMH MY HEAD";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "HEHE XD";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
		int[] numbers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			
		
		Random ran = new Random(); 
		int randomNum= ran.nextInt(100);
		numbers[i] = randomNum;
		}
		//9. without printing the entire array, print only the smallest number on the array\
		smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] < smallest ) {
				smallest = numbers[i];
			}
			
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//11. print the largest number in the array.
		largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > largest ) {
				largest = numbers[i];
			}
			
		}
		System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(numbers[49]);
	}
}
