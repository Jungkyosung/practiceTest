package mypack;

public class Gugudan {
	private int dan;
	
	Gugudan() {
		this.dan = 2;
	}
	
	Gugudan(int dan) {
		this.dan = dan;
	}
	
	void setDan(int dan) {
		this.dan = dan;
	}
	
	void print() {
		System.out.println("==================");
		System.out.printf("%d 단 \n", this.dan);
		System.out.println("==================");
		for (int i=1; i<10;i++) {
			System.out.printf("%d * %s = %2d \n", dan, i, dan * i);
		}
		
		
	}
}
