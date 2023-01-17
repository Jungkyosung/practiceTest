package practiceoop;

public class Car extends Driver{
	Tire tire;
	
	public Car(){
		tire = new KoreaTire();
		//tire = new AmericaTire();
	}
	public String getTireBrand() {
		return "장착된 타이어:" + tire.getBrand();
	}
	
}
