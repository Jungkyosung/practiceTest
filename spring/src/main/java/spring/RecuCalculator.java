package spring;

public class RecuCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		//long start = System.nanoTime();
		
	
		if (num <= 1) {
			//long end = System.nanoTime();
			return 1;
			
		} else {
			//long end = System.nanoTime();
			return num * factorial(num - 1);
		}
		
	}	
}

	