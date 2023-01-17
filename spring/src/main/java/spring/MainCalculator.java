package spring;

public class MainCalculator {

	public static void main(String[] args) {
		ImplCalculator implCal = new ImplCalculator();
		long start1 = System.nanoTime();
		implCal.factorial(10);
		long end1 = System.nanoTime();
		
		long start2 = System.nanoTime();
		RecuCalculator recuCal = new RecuCalculator();
		recuCal.factorial(10);
		long end2 = System.nanoTime();
		
		System.out.printf("impl.fact=%dns\n, recu.fact=%dns\n", (end1-start1), (end2-start2));
		
	}

}
