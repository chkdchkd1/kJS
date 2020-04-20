package day2;

public class OperatorEx4 {

	public static void main(String[] args) {
	
		// 비트연산자 예제
		/*
		12 : 00000000 00000000 00000000 00001100
		10 : 00000000 00000000 00000000 00001010
		8  : 00000000 00000000 00000000 00001000 (num1 & num2)
		14 : 00000000 00000000 00000000 00001110 (num1 | num2)
		6  : 00000000 00000000 00000000 00000110 (num1 ^ num2)
		-13: 11111111 11111111 11111111 11110011 (~num1)  */
		
		int num1 = 12 , num2 = 10;
		int num3 = num1 & num2;
		int num4 = num1 | num2;
		int num5 = num1 ^ num2;
		int num6 = ~num1;
		System.out.println("num1 & num2 = " +num3);
		System.out.println("num1 | num2 = " +num4);
		System.out.println("num1 ^ num2 = " +num5);
		System.out.println("~num1 = " +num6);
		
		//비트 쉬프트 연산자 예제
		System.out.println("10  << 1 : " + (10 << 1));
		System.out.println("10  << 2 : " + (10 << 2));
		System.out.println("10  << 3 : " + (10 << 3));
		
		System.out.println("10  >> 1 : " + (10 >> 1));
		System.out.println("10  >> 2 : " + (10 >> 2));
		System.out.println("10  >> 3 : " + (10 >> 3));
		
		
	
		

	}

}
