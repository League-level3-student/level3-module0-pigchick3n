package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	String[] strings;
	//1. Create a main method to test the other methods you write.
	 MoreArrayFun(String [] strings){
		this.strings = strings;
	 }
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void print(){
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void backwards(){
		for (int i = strings.length-1; i > 0; i--) {
			System.out.println(strings[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printother(){
		for (int i = 0; i < strings.length; i++) {
			if(i%2 == 0) {
			System.out.println(strings[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void printrand(){
		
		
		for (int i = 0; i < strings.length; i++) {
			Random ran = new Random(); 
			int randomNum= ran.nextInt(strings.length);
			System.out.println(strings[randomNum]);
		}
	}
	
}
