package day2;

public class RandomEx1 {

	public static void main(String[] args) {
		// random 예제 (임의의 값 정수를 생성 할 때 사용)
		int min = 0;
		int max = 10;
		int random = 0;
		
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random); 
		// 0 <= M*(max-min+1) < max-min+1
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		
				

	}

}
