package Day9_AdavanceOOp;
class Bank {
	int RateOfInterset() {
		return 0;
	}
}
class SBI extends Bank {
	@Override
	int RateOfInterset() {
		return 5;
	}
}
class HDFC extends Bank {
	@Override
	int RateOfInterset() {
		return 7;
	}
}
public class BankSystem {
	public static void main(String[] args) {
		Bank b1 = new SBI();
		Bank b2 = new HDFC();
		System.out.println("Rate of intersert on SBI : " + b1.RateOfInterset());
		System.out.println("Rate of interset on HDFC : " +b2.RateOfInterset());
	}
}
