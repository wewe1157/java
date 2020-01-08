package day01;

/*
  연산자01 - 산술 연사자
  1. 연산자 = 변수의 값을 이용하여 계산하는 특수문자들  
  2. 산술 연산자는 + - * %(나머지) /(나눗셈) 가 있다.
 */

public class Ex03 { 
	
	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 6;
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 % number2);
		System.out.println(number1 / number2);
		//위의 나눗셈은 정수인 결과값을 부동형에 전달하기 때문에 나눈 결과값의  
		//실수 부분을 출력하지 못한다.
		System.out.println((float)number1 / number2);
	}
}
