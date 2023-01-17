package spring;

public class ImplCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		// TODO Auto-generated method stub
		
		long result = 1 ;
		for (long i =num; i >=1; i--) {
			result *= i;
		}
		
		
		return result;
	}

}
