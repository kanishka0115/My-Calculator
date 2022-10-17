package MyCalcPkg;

public class MainCalculator {
	public static void main(String [] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.addition(2,4));
		System.out.println(c1.subtraction(2,4));
		System.out.println(c1.multiplication(2,4));
		System.out.println(c1.division(2,4));

		
	}
}
