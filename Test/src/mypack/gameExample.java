package mypack;

import java.util.Scanner;

public class gameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNumber = (int)(Math.random()*100);
		int tryCount = 1;
		
		
		
		System.out.println(computerNumber+ "컨닝");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; ; i++) {
			System.out.println("컴퓨터가 생성한 0~100 사이의 숫자는 무엇이라고 생각합니까?");
			try {
			int userNumber = scan.nextInt();
			if (computerNumber == userNumber) {
				//정답 및 횟수 출력
				System.out.print("!!!정답입니다!!!" + tryCount + "번만에 맞추셨습니다.");
				// 등급매기기
				makingGrade(tryCount);
				System.exit(0);
			}
			if (computerNumber < userNumber) {
				System.out.println("컴퓨터의 값은 본인의 입력한 수보다 작습니다. (현재"+tryCount+"번 시도했습니다.)");
				tryCount ++;
			}
			if (computerNumber > userNumber) {
				System.out.println("컴퓨터의 값은 본인의 입력한 수보다 큽니다. (현재"+tryCount+"번 시도했습니다.)");
				tryCount ++;
			}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요. 생각을 하세요!");
				System.exit(0);
			}
		}
	}

	static void makingGrade(int tryCount) {
		if (tryCount < 5) {
			System.out.println("<특등급>");
		} else if (tryCount < 10) {
			System.out.println("<상등급>");
		} else if (tryCount < 15) {
			System.out.println("<중등급>");
		} else {
			System.out.println("<하등급>");
		}	
	}
}
