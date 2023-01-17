package mypack;

public class A {
	
	//field
	int m = 3;
	int n = 4;
	
	//method
	void work1() {
		int k = 5;					//지역변수 - work1안에서만 사용
		System.out.println(m + n);	//클래스 필드 - 클래스에서 사용
		System.out.println(k);
		work2(3);
	}
	
	void work2(int i) {
		int j = 4;					//지역변수 - work2안에서만 사용
		System.out.println(m + n);	//클래스필드
		System.out.println(i + j);	//매개변수 - 지역변수로 사용
	}
	
}
