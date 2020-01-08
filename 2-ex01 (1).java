package day02;
/*
 조건문 01 - if문
 1.if는 if() 괄호안에 조건이 참일때 {}해당 코드블록을 실행한다.
 2.fomat 
 if(조건식){
  실행할 코드
 }
*/

public class ex01 {
	
	public static void main(String[] args)
	{
		int age = 25; 
		if(age < 18) {
			System.out.println("미성년자 입니다.");
			//변수는 해당 변수가 선언된 코드 블록 안에서만 유효하다.
			String name = new String("hi");
		}
		//System.out.println(name); 출력할 수 없음.
	}
}
