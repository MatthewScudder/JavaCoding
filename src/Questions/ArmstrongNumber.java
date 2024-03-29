package Questions;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		System.out.println("Given number is " + num);
		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("This is an ArmstrongNumber");
		} else {
			System.out.println("This is not an ArmstrongNumber");
		}

	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(99);
		isArmstrongNumber(570);

	}

}
