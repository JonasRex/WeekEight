//For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
//4.a create arrays of the following type and assign it at least 3 different values: 
//    - Integer array
//    - String array
//    - boolean array
//4.b Write a function that takes in an array of strings as parameter and prints each string.
//4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
//4.d Write a function that receives an integer array as a parameter and returns the average value.	
//4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.

import java.util.Arrays;

class Main {
	public static void main(String [] args) {
	int[] numb = {513, 154, 89, 623, 51};
	String[] word = {"Ape", "Bird", "Camel", "Dog", "Elephant"};
	boolean[] statement = {true, true, false};

		printStringArray(word);
		printSumInt(numb);
		printAvgValue(numb);
		printSortedArray(numb);

	}

	public static void printStringArray(String[] word) {
		System.out.println("\nList of Strings:");
		System.out.println("----------------");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}

	public static void printSumInt(int[] numb) {
		System.out.println("\nSum of numbers:");
		System.out.println("----------------");
		int sum = 0;
		for (int i = 0; i < numb.length; i++) {
			sum = sum + numb[i];
		}
		System.out.println(sum);
	}

	public static void printAvgValue(int[] numb) {
		System.out.println("\nAverage value of numbers: (" + numb.length + ")" );
		System.out.println("--------------------------");
		int sumAvg = 0;
		for (int i = 0; i < numb.length; i++) {
			
			sumAvg = sumAvg + numb[i];
			
		}
		System.out.println(sumAvg/numb.length);
	}

	public static void printSortedArray(int[] numb) {
		Arrays.sort(numb);
		System.out.println("\nSorted values:");
		System.out.println("-----------------");
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);
		}
	}
}