package day2;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		/*변수 넘버를 선언하고 num의 초기값을 설정하여(하지 않으면 쓰레기 값이 남아있기에) num가 0이면 0이라고 출력, 
		num가 양수면 양수라고 ex) num >=1 로 하면 정수 일때는 맞으나 실수가 왔을땐 정확하지 않다. 되도록이면 num > 0을 쓰는 것이
		좋다) 출력하고 음수면 음수라고 출력하는 코드를  if문을 사용하여 출력하세요 */
		
	int num = 0;
	System.out.print("정수를 입력하세요 : ");
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	if(num == 0) {
		System.out.println(num + "는 0.");
	}else if (num > 0) {
		System.out.println(num +"는 양수.");
	}else {
		System.out.println(num +"는 음수.");}
	
	scan.close();
}
	}

