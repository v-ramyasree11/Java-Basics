package Day11_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,44));
		System.out.println("Before ArrayList : " + list);

		// list.remove(3);
		boolean remove = list.contains(44);
		if(remove) {
			list.remove(Integer.valueOf(44));
		}
		System.out.println("After ArrayList : " + list);
	}
}
