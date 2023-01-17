package mypack;

import java.util.Scanner;

public class str {
	
	public static String getSex(String userUNumber, String sex) {
		
//		if (Integer.parseInt(userUNumber.substring(7,8)) == 1 || Integer.parseInt(userUNumber.substring(7,8)) == 3) {
//			sex = "남";
//		} else {
//			sex = "여";
//		}
		//switch 방식으로 구하기
		switch(Integer.parseInt(userUNumber.substring(7,8))){
			case 1:
				sex = "남";
				break;
			case 2:
				sex = "여";
				break;
			case 3:
				sex = "남";
				break;
			case 4:
				sex = "여";
				break;
		}
		return sex;
	}
	
	
	
	public static int getAge(int age, String userUNumber) {
		
		if (Integer.parseInt(userUNumber.substring(0,1)) == 0) {
			age = 2022-(2000+Integer.parseInt(userUNumber.substring(0,2)));
		} else {
			age = 2022-(1900+Integer.parseInt(userUNumber.substring(0,2)));
		}
		return age;
	}
	
	public static String getUserUNumber(String a){
		
		Scanner scanner = new Scanner(System.in);
		String b = "";
		String c = "";
		a = "";
		
		for (int i=0; i<20 ; i++) {	
			System.out.println("글자를 지우고 싶다면 x를 누르세요.");
			a = a + scanner.nextLine();
			b = a.substring(a.length()-1,a.length());
			//System.out.println(b);
			if (b.equals("x")) {
//				System.out.println("a:" + a);
//				System.out.println("a길이:" + a.length());
				a = a.replace("x","");
				a = a.substring(0, a.length()-1);
				System.out.println(a);
				continue;
			}
			if (a.length() < 6) {
				//a = a + scanner.nextLine();
				System.out.println(a);
				continue;
			}
			if (a.length() == 6 ) {
				a = a + "-";
				System.out.println(a);
				continue;
			}
			if (!(a.substring(6).equals("-")) ) {
				//a = a + scanner.nextLine();
				//만약 7째자리가 "-" 아니면 7이후자리 따로 저장하고 "-"추가
				c = a.substring(6,a.length());
				a = a.substring(0,6) + "-" + c;
				System.out.println(a);
				continue;
			} 
			if (a.length() <= 12 ) {

				System.out.println(a);
				continue;
			} 
			
			if (a.length() == 13) {
				break;
			}
			if (a.length() >= 14) {
				a= a.substring(0,13);
				break;
			}
		}
		
		//하나씩 입력하면 하나씩 추가한다. 
		//만약 6자리 입력하면 > "-"를 붙인다.
		//한번에 13자리 입력하면
		//뒤로 가고 싶다면? x를 눌러라
		//한번에 13자리 넘게 입력하면 값을 저장하지 않고 다시 입력하게 함.
		//

		return a;
		
	}
	
}
