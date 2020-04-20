package day2;

import java.util.Scanner;

public class ForEX4 {

	public static void main(String[] args) {
		/* num가 주어지면 주어진 num의 약수를 출력하는 코드를 for문으로 작성하세요. 
		* 약수 : 나누었을 때 나머지가 0인 수 
		* 4의 약수 : 1 2 4
		* 1. 반복횟수 : 1~num까지 = i<=num ->for문 
		* 2. 규칙성 : i가 num의 약수면 i를 출력 = num를 i로 (나누었을 때 나머지)가 0과 (같다)(면) i를 출력
		* = 잘 모르겠을 땐 코드를 한국어로 배치해보기 ex) if(num를 i로 나누었을 때 나머지가 0과 같다){i출력} (~하다면=if)
		* 3. 반복문 종료 후 : 없음
		* 설명보고 코드짜는 연습하기 위의 예시처럼.*/
		
		
		int i, num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		for(i=1;i<=num;i++) {
			if (num %i == 0) {System.out.println(i);} 
			// System.out.println(""+i+(i!=num?",":""));
			
	
		scan.close();

		
	}

}
}
