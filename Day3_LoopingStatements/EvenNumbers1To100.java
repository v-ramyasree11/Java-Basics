package Day3_LoopingStatements;

public class EvenNumbers1To100 {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i+=2) {
			/* Here we can use if condition also "if (i % 2 == 0) 
			but this type of code for loop iterate 100 times it checks every time
			so we this format i = 2 and increment 2 times it iterate 50 times only 
			so it is more efficient than if condition */ 
			System.out.println(i);
		}
	}

}
