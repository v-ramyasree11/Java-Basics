package Day11_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Q10 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(12);// duplicates allowed
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(13);
		set.add(12); // ignored
		set.add(15);
		set.add(12);
		
		System.out.println("ArrayList: " + list); // follow insertion order 
		System.out.println("HahsSet : " + set); // unordered
		
	}
}
