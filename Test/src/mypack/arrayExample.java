package mypack;

import java.util.Arrays;

public class arrayExample {
	public static void main(String[] args) {
		int[][] a1 = new int[3][];
		a1[0] = new int[] {3, 4};
		a1[1] = new int[] {3,4,5};
		a1[2] = new int[] {6,7,8,1,1,1,1,1,1,1,0,0,0,};
		
		
		System.out.println(Arrays.deepToString(a1));
		
		a1[0][0] = 1;
		a1[0][1] = 2;
		
		
		System.out.println(Arrays.deepToString(a1));
		System.out.println(a1[0].length);
		System.out.println(a1[1].length);
		System.out.println(a1[2].length);
		
	
		System.out.println(Arrays.toString(a1[0]));
		
		
		int[][] a2 = new int[][] { {1,2}, {3,4,5} , {6,7,8,9} };
		System.out.println(Arrays.deepToString(a2));
		
		int[][] a3 = {{1,2}, {3,4,5} , {6,7,8,9}};
		System.out.println(Arrays.deepToString(a3));
	}
	
}
