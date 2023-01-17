package spring;

public class ExcuteTimeCalculator implements Calculator {

	private Calculator delegate; //대표자
	
	public  ExcuteTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start1 = System.nanoTime();
		long result = delegate.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행시간 = %d\n",
				delegate.getClass().getSimpleName(), num, (end1-start1));
		return result;
	}


	
	
}
