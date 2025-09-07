package Day11_Collections;

import java.util.Arrays;
import java.util.HashSet;

public class Q5 {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(12,14,1213,12,113,13));
		System.out.println("HashSet : " + numbers);
	}
}
