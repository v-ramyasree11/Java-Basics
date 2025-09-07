package Day11_Collections;

import java.util.Arrays;
import java.util.HashSet;

public class Q4 {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>(Arrays.asList("Ram", "Sita", "Hanuman", "Laxman"));
		names.add("Arjuna");
		System.out.println("HashSet: " + names);;
	}
}
