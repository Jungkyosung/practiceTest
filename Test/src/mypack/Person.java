package mypack;

import java.util.Scanner;

public class Person {

//	메서드 호출하면 
//	>>> 홍길동
//	>>> - 주민번호: 921010-1821117
//	>>> - 성별: 남
//	>>> - 나이: 30세
//	>>> - 생년월일 1992년 10월 10일
//	>>> - 2000년 이전 출생: Y
//	객체를 생성할 때는 Person P = new Person("홍길동", "921010-1821117")
	
	//field
	String name;
	String regno;
	String gender;
	String birthYear;
	int birthMonth;
	int birthDay;
	boolean isOlder;
	int age;
	
	//constructor
	Person(){
	}
	
	Person(String name, String regno){
		this.name = name;
		this.regno = regno;
		
		//주민번호가 1: 3이면 남, 2: 4면 여
		if (Integer.parseInt(regno.substring(7,8)) == 1 ||
			Integer.parseInt(regno.substring(7,8)) == 3) {
			gender = "남";
		} else {
			gender = "여";
		}
		
		//앞자리가 0이면 isOlder = false, 2000 1900
		//앞자리가 0이면, 20+ 주민앞 2자리, 아니면 19 + 앞2자리
		if (Integer.parseInt(regno.substring(0,1)) == 0) {
			age = 2022-(2000+Integer.parseInt(regno.substring(0,2)));
			isOlder = false;
			birthYear = "20" + regno.substring(0,2);
		} else {
			age = 2022-(1900+Integer.parseInt(regno.substring(0,2)));
			isOlder = true;
			birthYear = "19" + regno.substring(0,2);
		}
		
		//월은 주민 substring 2,4
		//일은 주민 substring 4,6
		birthMonth = Integer.parseInt(regno.substring(2,4));
		birthDay = Integer.parseInt(regno.substring(4,6));
	}
	
	//method-print
	void printPersonInfo() {
		System.out.println(">>> " + name);
		System.out.println(">>> - 주민번호: " + regno);
		System.out.println(">>> - 성별: " + gender);
		System.out.println(">>> - 나이: " + age);
		System.out.println(">>> - 생년월일: " + birthYear + "년 " + birthMonth +
							"월 " + birthDay + "일" );
		System.out.println(">>> - 2000년 이전 출생: " + (isOlder? "Y" : "N"));
	}

	//method-setting(Name)
	String setName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name = scan.nextLine();
		scan.close();
		return name;
	}
	
	//method-setting(RegNo)
	String setRegno() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요 ex) 000000-0000000");
		regno = scan.nextLine();
		scan.close();
		return regno;
	}
}
