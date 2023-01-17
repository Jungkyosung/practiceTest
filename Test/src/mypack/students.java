package mypack;

import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 3;
		final int CLASS = 3;	
		int[][] scores = new int[CLASS][STUDENTS];
			
		Scanner scan = new Scanner(System.in);
			
		for (int i=0; i < scores.length ; i++) {
			for (int j=0; j < scores[i].length ; j++) {
				System.out.println((i+1)+"반의"+(j+1)+"번의 점수를 입력하세요");
				scores[i][j] = scan.nextInt();
			}
		}
		
		int totalSum = 0;
		int[] classSum = new int[CLASS];
		double totalAvg;
		
		for (int i = 0; i < scores.length ; i++) {
			System.out.println("****"+(i+1)+"반****");
			for (int j=0; j<scores[i].length;j++) {
				System.out.println((j+1)+"번의 점수는"+scores[i][j]+"입니다.");
				classSum[i] += scores[i][j];
				totalSum += scores[i][j];
			}
			System.out.println((i+1) + "반의 점수합은:" + classSum[i]);
			System.out.println((i+1) + "반의 점수평균은:" + ((double)classSum[i]/scores.length));
		System.out.println("----------------------");
		}
		
		
		totalAvg = (double)totalSum / (scores.length * scores[0].length);
		System.out.println("학년의 총점은:" + totalSum);
		System.out.println("학년의 평균은:" + totalAvg);

	}

}
