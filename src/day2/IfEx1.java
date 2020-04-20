package day2;



public class IfEx1 {

	public static void main(String[] args) {
		//조건문 if 기본 문법 , if(조건식1){ 조건식 1 이 참이면 실행문 1을 실행해라}
		int num = 4;
	
		if(num %2 == 0) {System.out.println(num +"는 짝수이다.");}
		// num가 짝수면 짝수라고 출력한다. if(num가 짝수이다){num이 짝수라고 출력}
		if(num %2 != 0) {System.out.println(num +"는 홀수이다.");}
		
		
		//if else if(조건식2){//조건식 1이 거짓이고 조건식2가 참이면 실행문 2를 실행하라} 
		if(num %2 == 0) {System.out.println(num +"는 짝수이다.");}
		else if (num %2 != 1) {System.out.println(num +"는 홀수이다.");}
		
		
		//if else {현재 위치를 기준으로 위에 있는 모든 조건식이 거짓이면 이 실행문3을 실행하라} ,else는 조건식이 없다
		
		if(num %2 == 0) {System.out.println(num +"는 짝수이다.");}
		else {System.out.println(num +"는 홀수이다.");}
		
		

		
	}

}
