package Questions;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int[] numbers = { -5, 0, 5, 7, 99, 123, 652, 47, 33, 16 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("given array is: " + Arrays.toString(numbers));
		System.out.println("Largest number is -->" + largest);
		System.out.println("Smallest number is -->" + smallest);

	}

}
