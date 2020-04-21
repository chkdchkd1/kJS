package day3;

public class FoxEx5_1 {


		public static void main(String[] args) {
			// for문에서의 실수
			
			int i;
			//의도적인 무한루프 코드
			/*for( ; ; ){
			 System.out.println("hello");
			}*/
			
			//에러 발생, 위의 무한루프로 인해 실행되지 않음
			//System.out.println("hello");

			int sum = 0;
			/* i값이 변경되지 않아 무한루프에 빠짐
			for(i=1;i<=5;sum++) {
				System.out.println("hello");
			} */
			
			/* i가 계속 감소하여 언더플로우로 인해 정수 최대값(실수 제일적은값에서 더빼면 정수로 순환되기에)이 되는 순간까지 반복
			for(i=1;i<=5;i--) {System.out.println("hello");
			*/
			
			//반복문이 한번도 실행되지 않은 경우
			for(i=10;i<=5;i++) {
				System.out.println("hello");
			}
			
			//변수는 선언한 위치부터 변수가 선언되 {}안에서 유효하다
			// for문의 초기화에서 선언한 변수는 반복문 안에서만 유효하다. (반복문안에서도 선언할 수 있다)
			for(int j=1;j<=5;j++) {
				System.out.println("j");
				char ch = 'A';
				System.out.println((char)(ch+j));
			} 
			// 아래의 코드는  j의 사용 범위 밖에서 j를 사용했기 때문에 에러
			// System.out.println(j); 
		}

	}