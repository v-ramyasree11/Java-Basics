package Day11_Collections;

import java.util.HashMap;

public class q8 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Ram", "Sita");
		map.put("Krishna", "Radha");
		map.put("Shiva", "Parvathi");
		map.put("UK", "London");
		System.out.println("HashMap (Before) : " + map);
		map.remove("UK");
		System.out.println("HashMap (After) : " + map);
	}
}
