package mypack;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {

		method(1, 2, 3, 4, 5, 6, 7);
	}
	

	private static void method(int... values) {
		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		for (int value: values) {
			System.out.println(value);
		}
	}
	
}
