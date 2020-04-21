package day3;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		/* 정수 num가 소수 인지 아닌지 판별하는 코드를 for문을 이용하여 작성하세요.
		 * 소수 : 약수가 2개 인수 
		 * 약수 : 나누었을 때 나머지가 0인수  (num를 i로 나누었을 때 나머지가 0과 같다 = num%i)
		 * num을 i로 나누었을 때 나머지가 0인 수가 2개 일때  (~인 수를 카운트 하기위해 새로운 변수를 선언한다. )
		 * 1. 반복 횟수 : i는 1부터 num까지 1씩 증가
		 * 2. 규칙성 : i가 num의 약수이면 약수의 갯수(cnt)를 1 증가 (카운트 개념) 
		 * 3. 반복문 종료후 : 약수의갯수가 2이면 소수라고 출력하고 아니면 소수가 아님이라고 출력 
		 * 이부분만 보고 코드 짜는 연습 - 문제만 보고 코드 짜는 연습
		 */
	
		int i, num = 0;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();		
		for(i=1;i<=num;i++) {  
			if (num %i == 0) {cnt++;} 
			
		}
	
		if (cnt==2) {
			System.out.println("해당 숫자는 소수입니다");
		}else {
			System.out.println("해당 숫자는 소수가 아닙니다");
		}
		
		scan.close();
		

	}

}
