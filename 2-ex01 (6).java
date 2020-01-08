package day02;
/*조건문 06 - switch문
switch문은 조건식을 넣지 않고 변수를 하나 선택해서, 해당 변수의 나올 수 있는 값들을
하나,하나 행동을 정해주는 형식이다.
*/

public class ex06 {
	public static void main(String[] args) {
		int age = 1;
		switch(age)
		{
		case 1:
			System.out.println("1살");
			break;
		case 2:
			System.out.println("2살");
			break;
		case 3:
			System.out.println("3살");
			break;
		default:
			System.out.println("그 외의 경우입니다");
			break;
		}
	}
}
