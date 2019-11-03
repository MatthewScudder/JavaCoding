package Questions;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPlay {

	public static void main(String[] args) {
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		employees.put(42686, "Jack");
		employees.put(36295, "Jan");
		employees.put(44985, "Rebecca");
		employees.put(11325, "Tom");
		employees.put(34965, "Bill");

		for (Entry<Integer, String> e : employees.entrySet()) {
			System.out.println("employee id " + e.getKey());
			System.out.println("employee name: " + e.getValue());
		}

	}

}
