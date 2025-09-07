package Day11_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,13,14,15,14,13));
		/* for (Integer item : list) {
			System.out.println(item);   ------ > here Integer is a Object type so it accepts the null type also Arrays.asList(12,13,14,null,14,13)
		}*/
		for (int num : list) {
			System.out.println(num);  // ------->  here int is a data type so it doesn't accepts the null type  Arrays.asList(12,13,14,null,14,13) cause error  "NullPointerException"
		}
		
	}
}
