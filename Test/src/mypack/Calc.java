package mypack;

public class Calc {
	public static void main(String[] args) {
		// 매개변수 개수확인
		// 두번째 매개변수 plus, minus 확인
		// plus면 첫 매개변수 + 마지막
		System.exit(0);
		System.out.println(args.length);
		try {
			if (args.length == 3) {
				int a = Integer.parseInt(args[0]);
				String b = args[1];
				int c = Integer.parseInt(args[2]);
				int result;
				if (b.equals("plus")) {
					result = a + c;
					System.out.println(a + " + " + c + " = " + result);
				} else if (b.equals("minus")) {
					result = a - c;
					System.out.println(a + " - " + c + " = " + result);
				} else {
					System.out.println("계산불가, 인수3개 입력하세요 ex) 5 plus 5");
				}

			} else {
				System.out.println("계산불가, 인수3개 입력하세요 ex) 5 plus 5");
			}

		} catch (Exception e) {
			System.out.println("계산불가, 인수3개 입력하세요 ex) 5 plus 5");
		}
	}
}
