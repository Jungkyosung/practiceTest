package mypack;

import java.io.IOException;

public class Sample1 {

	//field
	int i;
	double r;
	boolean b;
	String s;
	
	//method
	void work() throws IOException{
		int k=0;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		Sample1 sample = new Sample1();
		
		
		System.out.println(sample.i);
		System.out.println(sample.r);
		System.out.println(sample.b);
		System.out.println(sample.s.length());
		
	}
}


