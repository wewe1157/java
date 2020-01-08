package day02;
/*
 조건문03 = if, else if, else
 1.만약 조건을 여러 경우로 봐야한다면
 2.if, else if로 각각의 조건을 더 체크할 수 있다.
 */

public class ex03 {
 public static void main(String[] args)
 {
	 int age = 25;
	 if(age < 8) {
		System.out.println("유치원생");
	 }
	 else if(age < 13) {
		System.out.println("초등학생");
	 }
	 else if(age < 17) {
			System.out.println("중학생");
		 }
	 else if(age < 19) {
			System.out.println("고등학생");
		 }
	 else {
			System.out.println("대학생");
		 }
		 
 }
}
