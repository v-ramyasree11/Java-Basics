package Day11_Collections;

import java.util.HashMap;
import java.util.Map;

public class Q7 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(Map.of("India" , "Delhi", "UK", "London"));
		map.putIfAbsent("USA", "Washington");
		map.put("Canada", "Ottawa");
		System.out.println("Captial of India : " + map.get("India"));
		System.out.println("Capital of UK : " + map.get("UK"));
	}
}
