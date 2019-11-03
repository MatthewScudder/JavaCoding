package Questions;

public class IntegerSwap {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		// 1.with using third variable
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("x-->" + x);
		System.out.println("y-->" + y);

		// 2.without using third variable,using + operator
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x-->" + x);
		System.out.println("y-->" + y);

		// 3.without using third variable,using *operator
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("x-->" + x);
		System.out.println("y-->" + y);

		// 4.using XOR:^
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("x-->" + x);
		System.out.println("y-->" + y);

	}

}
