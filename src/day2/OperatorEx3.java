package day2;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 비교연산자와 논리연산자 예제
		/* score가 90점 이상이고 score가 100점 이하 
		90 <=score(점수라는변수) <=100 는 비교식은 참거짓으로 나오기에 숫자랑 비교할 수 없다.
		score >= 90 && score <=100 */
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		score = scan.nextInt(); // 점수 입력
		boolean isA = score >= 90 && score <= 100;
		boolean isB = score >= 80 && score <= 89;
		boolean isC = score >= 70 && score <= 79;
		boolean isD = score >= 60 && score <= 69;
		boolean isF = score >= 0 && score <= 59;
		boolean isNotScore = score < 0 || score > 100;
		System.out.println("A학점인가? : " + isA);
		System.out.println("B학점인가? : " + isB);
		System.out.println("C학점인가? : " + isC);
		System.out.println("D학점인가? : " + isD);
		System.out.println("F학점인가? : " + isF);
		System.out.println("유효한학점인가? : " + !isNotScore);
		

		
		scan.close();
		
		
	}

}
