package mypack;

import java.util.Scanner;

public class PersonExec {

	public static void main(String[] args) {
		String name;
		String regno;
		
		Person setting = new Person();
		
		// Q. name 과 regno를 입력받아서 설정하고 싶은데 Print메소드랑 별개로 메소드를 만들고 싶음.
		// 1. 그러면 기본생성자를 새로 만들어야 하는지?
		// 2. 리턴 값은 하나만 받아오니까 name, regno 따로 메소드 작성 해야하는지?
		
		name = setting.setName();
		regno = setting.setRegno();
		
		Person person = new Person(name, regno);
		person.printPersonInfo();
		
		//person메소드를 하면서 입력값을 받을 순 있지만, 기능적으로 분리하는 게 좋을 듯.
			//name = person.setName();   불가   
			//regno = person.setRegno();   불가
	}
}
