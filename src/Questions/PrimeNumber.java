package Questions;

public class PrimeNumber {
	// 2 is the lowest prime number
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				System.out.println(i + "");
		}
	}

	public static void main(String[] args) {
		System.out.println("2 is prime number" + isPrimeNumber(2));
		System.out.println("13 is prime number" + isPrimeNumber(13));
		System.out.println("99 is prime number" + isPrimeNumber(99));
		System.out.println("17 is prime number" + isPrimeNumber(17));

		getPrimeNumbers(99);
	}

}
