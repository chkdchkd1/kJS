package day2;

public class ForEX2 {

	public static void main(String[] args) {
		// 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		//1. 반복횟수 : i는 1부터 9까지 1씩 증가 
		//2. 규칙성 : i에 7씩 곱한다. = 7*i

		int i, num = 7;
		for(i=1;i<10;i++) {System.out.println( num + " x " + i +" = "+ i*num);}
		// i+=1 = i++
		for(i=1;i<10;i++) {System.out.printf("%d x %d = %d\n", num, i, num*i);
		}

}
}



