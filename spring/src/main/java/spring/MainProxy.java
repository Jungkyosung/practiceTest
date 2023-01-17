package spring;

public class MainProxy {

	public static void main(String[] args) {
		
		ExcuteTimeCalculator c1 = new ExcuteTimeCalculator(new ImplCalculator());
		System.out.println(c1.factorial(10));
		ExcuteTimeCalculator c2 = new ExcuteTimeCalculator(new RecuCalculator());
		System.out.println(c2.factorial(10));
	
	}

}
