package Questions;

public class StringSwap {

	public static void main(String[] args) {
		// swap strings without using third variable
		String a = "Hello";
		String b = "World";

		System.out.println("Before swapping:");
		System.out.println("the value of a is--> " + a);
		System.out.println("the value of b is--> " + b);

		// 1.append a and b
		a = a + b;

		// 2. Store initial string a in string b:
		b = a.substring(0, a.length() - b.length());

		// 3.Store initial string b in String a:
		a = a.substring(b.length());

		System.out.println("After swapping:");
		System.out.println("the value of a is--> " + a);
		System.out.println("the value of b is--> " + b);

	}

}
