package mypack;

import java.util.Arrays;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb = new StringBuffer();
//		sb.append("녕안녕안");
//		sb.append("하세요안녕안");
//		String str = sb.toString();
//		System.out.println(sb.toString());
//		System.out.println(sb.toString().length());
//		System.out.println(str.charAt(2));
//		System.out.println(str.indexOf("안",0));
		
		
//		
//		int a = str.indexOf("안",0); //첫째
//		System.out.println(str.indexOf("안",a));
//		for (int i = 0; i < 1;i++) {
//		a = str.indexOf("안",a+1);   //둘째(3)
//		//a = str.indexOf("안",a+1);   //셋째(7)
//		//a = str.indexOf("안",a+1);   //넷째(9)
//		}
//		System.out.println(str.indexOf("안",a));
//		
		
		
		
		//System.out.println(str.indexOf("안") + 1);
		//System.out.println(String.valueOf("asdf"));
		//System.out.println("" + 1234L);
		//String s1 = "안녕";
		//String s2 = "하세요";
		//System.out.println(s1.concat(s2));
		
		String s5 = "abcABC123가나다";
//		char[] charArray = s5.toCharArray();
//		for (char c : charArray) {
//			System.out.printf("[%c] ", c);
//		}
		// 문자열을 byte[]로 변환 => getBytes([Charset cs])
				byte[] byteArray = s5.getBytes();
				for (byte b : byteArray) {
					System.out.printf("[%x] ", b);
				}
				System.out.println();

				// #5 문자열 수정
				// 영문자를 소문자로 변환 => toLowerCase();
				System.out.println(s5.toLowerCase());
				
				// 영문자를 대문자로 변환 => toUpperCase();
				System.out.println(s5.toUpperCase());
		
				// 문자열의 내용 중 일부 문자를 다른 문자로 변경 => replace(char oldChar, char newChar)
				System.out.println(s5.replace('b', 'x'));
				System.out.println(s5.replaceAll("가나", "왔나"));
				
				// 문자열의 일부를 추출 => substring(int beginIndex [, int endIndex])
				//               012345 6 7 8 9 012345    
				 String str = "Jane 안녕하세요. Jane";
				System.out.println(str.substring(5));
				System.out.println(str.substring(5, 9));
				System.out.println(str.substring(5, 10));

				// 문자열을 특정 문자(=딜리미터)를 기준으로 분리 => split(String regex)
				// str 문자열을 공백을 기준으로 분리 
				String[] strArray = str.split(" ");
				System.out.println(Arrays.toString(strArray));
				System.out.println(strArray[0]);
				
				String str1 = "abcABC";
				String str2 = "ABCabc";
				
				System.out.println(str1.equalsIgnoreCase(str2));

				
	}
}
