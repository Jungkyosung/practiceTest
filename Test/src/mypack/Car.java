package mypack;

public class Car {
	//field
	String model;
	boolean start;
	int speed;
	
	//constructor
	Car(){
	}
	
	Car(String model){
		this.model = model;
	}
	
	//method
	void speedUp() {
		speed++;
		if (speed > 0) {
			start = true;
		}
		System.out.println("현재 속도는"+speed+"입니다.");
	}
	
	void speedDown() {
		speed--;
		if (speed <= 0) {
			start = false;
		}
		if (start = true) {
		System.out.println("현재 속도는"+speed+"입니다.");
		} else {
			System.out.println("현재 속도는"+speed+"입니다. 차량이 정지했습니다.");
		}
	}
	
	void printCarState() {
		System.out.printf("모델 %s는 속도 %d으로 %s 상태입니다.\n", 
				         model, speed, start? "운행" : "정지");
	}
}
