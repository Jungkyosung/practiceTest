package mypack;

import java.util.Scanner;

public class strExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		String userName = scan.nextLine();
//		String userUNumber = scan.nextLine();
		String userName = "이름: 홍길동"; //userName
		String userUNumber = "주민번호:    520101-4821117"; //userUNumber
		String sex = " ";
		int age = 0;
		int startNum;
		
		String a = "";
		a = str.getUserUNumber(a);
		System.out.println(a);
		
		//이름추출
		startNum = userName.indexOf(":");
		userName = userName.substring(startNum+1,userName.length());
		userName = userName.trim();
		
		//주민번호 추출
		startNum = userUNumber.indexOf(":");
		userUNumber = userUNumber.substring(startNum+1,userUNumber.length());
		userUNumber = userUNumber.trim();
		
		System.out.println(userUNumber);
		
		//나이,성별구하기
		sex = str.getSex(userUNumber, sex);
		age = str.getAge(age, userUNumber);
		
		//String strResult = "  >>>"+userName+"("+userUNumber+", "+sex+", 나이 "+ age+"세)";
		//System.out.println(strResult);
		System.out.printf("  >>>%s(%s, %s, 나이 %d세)\n",userName,userUNumber,sex,age); 
	}

	

	
	
	
	
	

	
	
}
