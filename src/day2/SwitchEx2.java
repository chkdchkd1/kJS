package day2;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		/* 달(월)이 주어지면 해당하는 달의 마지막을 출력하는 코드를 switch문을 이용하여 작성하세요.
		31 : 1 3 5 7 8 10 12
		30 : 4 6 9 11
		28 : 2 */
		
		
		int month = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("달(월)을 입력하세요 : ");
		month = scan.nextInt();
		
		switch (month) { 
		case 1 : case 3 : case 5 : case 7: case 8: case 10: case 12:
				System.out.println(month + "월의 마지막일은 31일 입니다.");
				break;
		case 4 : case 6 : case 9 : 	case 11: 
			    System.out.println(month + "월의 마지막일은 30일 입니다.");
			    break;
	    default :
	    	System.out.println(month + "월의 마지막 요일은 28일 입니다.");
				
	    	scan.close();
	    	
		/*case 1 : //default:
				System.out.println(num + "는 홀수");
				break; //default는 break 있어도 그만 없어도 그만 */
				
	
	}
	
}
}

