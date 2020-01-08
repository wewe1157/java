package day02;
//조건문 02 - if else 구조
//if문의 조건을 만족하지 않을 경우에(if문이 false일 경우)
//else문을 만들어 else의 코드블록을 실행하게 할 수 있다.

public class ex02 {

	public static void main(String[] args)
	{
		int age = 15;
		if(age >= 18) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
	}
}
