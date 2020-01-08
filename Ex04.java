package day01;
/*
 연산자 02 - 증감연산자
 1.증감연산자는 변수의 현재값을 1씩 증가시키거나 감소시킨다.
 2.증감연산자는 전위연산과 후위연산이 있다.
 3.종류 = --,++
 
 */

public class Ex04 {
 
	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 3;
		System.out.println(number1++);
		// = 후위연산은 해당줄에서 실행 순서가 가장 마지막이 된다.
		// 출력 후, 1증가 
		System.out.println(number1);
		System.out.println(--number1);
		// = 전위연산은 해당줄에서 실행 순서가 가장 먼저가 된다.
		// 1감소 후 출력.
		System.out.println(number1);
		
		number1 += ++number2;
		System.out.println(number1);
		number1 += number2++;
		System.out.println(number1);
	}
}
