package mypack;

public class GugudanExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan gugudan = new Gugudan();
		
		//gugudan.dan = 1;
		gugudan.setDan(2);
		gugudan.print();
		
		Gugudan g2 = new Gugudan();
		
		g2.print();
		
		Gugudan g3 = new Gugudan(3);
		g3.print();
		
		for (int i=2; i<10 ; i++) {
			gugudan.setDan(i);
			gugudan.print();
		}
		
	}
}
