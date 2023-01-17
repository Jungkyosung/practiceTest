package mypack;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("제네시스");
		
		car.speed = 0;
		car.start = false;
		
		String myModel = car.model;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("속도를 올리고 싶으면 1, 줄이고 싶으면 2, 멈추고 싶으면 그외의 아무키나 누르세요.");
		int accBr = 0;
		for (int i = 0; ;i++) {
			accBr = scan.nextInt();
			if (accBr == 1) {
			car.speedUp();
			} else if(accBr == 2) {
				car.speedDown();
			} else {
				car.speed = 0;
				car.start = false;
				car.printCarState();
				break;
			}
		}
	
	}

}
