package abc.bcd;

public class prog {
	public static void main(String[] args) {
		Car myCar = new Car("아반떼", 2016, "흰색", 200);	// 생성자의 호출
		System.out.println(myCar.getModel());	// 생성자에 의해 초기화되었는지를 확인함.
	}
}
