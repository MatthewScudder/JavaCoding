package Questions;

import java.util.ArrayList;

public class FindOddNumber {

	public static void main(String[] args) {
		int[] a = { 5, 7, 6, 12, 0, 88, 45, 94, 10, 354, 128, 66, 57, 44, 129 };

		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				b.add(a[i]);
			}
		}

		for (int j = 0; j < b.size(); j++) {
			System.out.print(b.get(j));
			if (j != (b.size() - 1)) {
				System.out.print(",");
			}
		}

	}

}
