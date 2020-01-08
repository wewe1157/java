package day01;
//주석 - 예제1
//주석으로 처리된 텍스트는 컴파일 단계에서 무시된다.
/*
 여러 줄로 주석 처리하기 
*/

/*
1. 기본형은 해당 주소에 값이 저장되어있는 형태.primitive datatype (stack)
2. 참조형은 해당 주소에 값이 아니라 값들이 저장되어 있는 주소값이 저장되어 있다.(heap)

3. 기본형의 8가지 데이터 타입
byte, short, int, long, float, double, char, boolean
byte, shor, int, long : 정수형 데이터 타입
   8,   16,  32, 64, 비트
float, double : 실수형 데이터 타입
   32,     64비트
char: 문자형 데이터타입
boolean : 참/거짓 데이터타입 (1비트) 

4.참조형의 3가지 타입
 class, interface, array.
 */

public class Ex01 {

 public static void main(String[] args) {
	 
	 int Number;
	 Number = 5;
	 System.out.println(Number);
	 Number = 10;
	 System.out.println(Number);
	 
	 int Number2 = 20;
	 System.out.printf("%d%n",Number2);
	 
	 //type casting
	 
	 //1.암시적 형변환(implicit type casting)
	 double dNum = Number2;
	 System.out.println(dNum);
	 
	 //2.명시적 형변환(explicit type casting)
	 int Number3 = (int)dNum; 
	 System.out.println(Number3);
	 
	 //다운캐스팅시 0000 0000
	 byte myByte = (byte)-129;
	 System.out.println(myByte);
 }
	
}
