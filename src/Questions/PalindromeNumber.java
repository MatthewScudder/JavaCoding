package Questions;

public class PalindromeNumber {
	public static void isPalindromeNumber(int num) {
		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(155);
		isPalindromeNumber(151);
		isPalindromeNumber(232);
		isPalindromeNumber(685);
	}

}
