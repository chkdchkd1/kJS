package day2;

public class ForEx3 {

	public static void main(String[] args) {
		// 1부터 10까지의 합을 구하는 코드를 for문을 작성하세요
		//1. 반복횟수 i는 10까지 1씩 증가
		/* 2. 규칙성(실행문에 들어가야 할 것) = sum = sum+i
		 *  i = 1 , sum= 0 +1  
			i = 2 , sum = 0 +1 +2 
			i = 3 , sum = 0 + 1 + 2+ 3 
			sum0 = 0 
			i = 1 , sum1 = sum0 +1
			i = 2 , sum2 = sum1 +2
			i = 3 , sum3 = sum2 +3
			sum = sum + ?  */
		
	  int i , sum = 0;
	  
      for(i=1;i<11;i++) {sum = sum + i;}
      System.out.println("1부터 10까지의 합은 :  " + sum );
     
	}


}
